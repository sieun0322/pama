package com.example.pama.repository;


import com.example.pama.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    public Member findByNickname(String nickname);

}
