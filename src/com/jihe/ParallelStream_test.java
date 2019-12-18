package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		//并行流
		List<String> list=Arrays.asList("张三","李四","张晓明","张阳");
		Stream<String> ps=list.stream();
		System.out.println(ps.isParallel());
		list.forEach(j->System.out.println(j));
		//串行流
		Stream<String> stream=Stream.of("张三","李四","张晓明","张阳");
		Stream<String> p=stream.parallel();
		System.out.println(p.isParallel());
		list.forEach(j->System.out.println(j));
	}

}
