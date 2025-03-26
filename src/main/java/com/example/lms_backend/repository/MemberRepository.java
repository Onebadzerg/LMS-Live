package com.example.lms_backend.repository;

import com.example.lms_backend.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByMemberName(String memberName);
}
