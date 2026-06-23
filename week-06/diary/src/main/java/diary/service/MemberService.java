package diary.service;

import diary.domain.Member;
import diary.dto.MemberSignupRequest;
import diary.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public Member signup(MemberSignupRequest request) {
        if (memberRepository.existsByEmail(request.getEmail())) {
            throw new IllegalStateException("이미 가입된 이메일입니다: " + request.getEmail());
        }
        Member member = new Member(request.getEmail(), request.getPassword(), request.getNickname());
        return memberRepository.save(member);
    }
}
