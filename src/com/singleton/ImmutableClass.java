package com.singleton;

final class ImmutableClass {
	private static int id;
	private static  String name;
	
	public ImmutableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static int getId() {
		return id;
	}
	public static String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		 ImmutableClass immu = new ImmutableClass(10, "Kumaran");
		 System.out.println(immu.getId()+" "+immu.getName());
		 ImmutableClass verify = immu.verify(11, "kalyan");
		 System.out.println(verify.getId() +" "+verify.getName());
	}
	public ImmutableClass verify(int id, String name) {
		if(this.id == id && this.name == name) {
			 return this;
		 }else {
			 ImmutableClass imm = new ImmutableClass(id,name);
			 return imm;
		 }
	}

}
