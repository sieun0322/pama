package com.example.pama.config.auth;

import com.example.pama.entity.Member;
import com.example.pama.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//login 요청이 오면 자동으로 loadUserByUsername 실행
@Service
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Member memberEntity = memberRepository.findByNickname(name);
        if(memberEntity != null){
            return new PrincipalDetails(memberEntity);
        }
        return null;
    }
}
