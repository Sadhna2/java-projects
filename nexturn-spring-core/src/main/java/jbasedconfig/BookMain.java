package jbasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=
    			new AnnotationConfigApplicationContext(NexturnConfiguration.class);
    	Book bk=ctx.getBean("getBook",Book.class);
    	System.out.println(bk.getId()+" "+bk.getTitle()+" "+bk.getAuthor());
		
	}
}
