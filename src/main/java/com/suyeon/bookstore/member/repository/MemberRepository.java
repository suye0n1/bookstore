package com.suyeon.bookstore.member.repository;

import com.suyeon.bookstore.member.dto.LoginDto;
import com.suyeon.bookstore.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);

}
