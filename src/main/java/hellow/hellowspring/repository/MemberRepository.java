package hellow.hellowspring.repository;

import hellow.hellowspring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    // Null을 처리하는 방법중 하나로 Optional
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
