package com.sparta.feed24.service;


import com.sparta.feed24.domain.Memo;
import com.sparta.feed24.domain.MemoRepository;
import com.sparta.feed24.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {

    private MemoRepository memoRepository;

    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                NullPointerException::new
        );
        memo.update(requestDto);
        return memo.getId();
    }
}
