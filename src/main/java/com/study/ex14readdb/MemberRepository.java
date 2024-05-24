package com.study.ex14readdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    //기본메소드 (따로 기술 안 해도 됨)
    //1. findAll
    //2. findById
    //3. count()
    //4. save() : update, insert
    //5. delete() : delete

    //쿼리 메소드, JPQL, NativeSQL 아래에 등록


}
