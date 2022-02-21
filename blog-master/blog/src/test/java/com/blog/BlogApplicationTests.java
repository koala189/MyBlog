package com.blog;

import com.blog.dao.BlogDao;
import com.blog.util.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class BlogApplicationTests {

	@Test
	void contextLoads() {
		String str = MD5Utils.code("www12563");
		System.out.println(str);
	}

}
