package coding.streamlearning;

import java.util.*;
import java.util.stream.Collectors;


public class Java8ListToMap {


	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));

	    Map<Integer,String> map =	list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
	    map.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
