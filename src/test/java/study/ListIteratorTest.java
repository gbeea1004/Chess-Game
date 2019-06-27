package study;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * 목표 : ListIterator 인터페이스 학습
 * ListIterator는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스
 * Iterator는 컬렉션의 요소에 접근할 때 한 방향으로만 이동 가능했다.
 * ListIterator 인터페이스는 컬렉션 요소 접근을 양 방향으로 이동하는 것을 지원
 */

public class ListIteratorTest {
    private List<Integer> numbers = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }

    @Test
    public void 앞에서부터_컬렉션조회() {
        ListIterator numbersIter = numbers.listIterator();
        while (numbersIter.hasNext()) {
            System.out.print(numbersIter.next() + " ");
        }
    }

    @Test
    public void 뒤에서부터_컬렉션조회() {
        ListIterator numbersIter = numbers.listIterator(numbers.size());
        while (numbersIter.hasPrevious()) {
            System.out.print(numbersIter.previous() + " ");
        }
    }

    @Test
    public void 앞에서부터_조회하고_이전조회() {
        ListIterator numbersIter = numbers.listIterator();
        while (numbersIter.hasNext()) {
            System.out.print(numbersIter.next() + " ");
        }

        while (numbersIter.hasPrevious()) {
            System.out.print(numbersIter.previous() + " ");
        }
    }
}
