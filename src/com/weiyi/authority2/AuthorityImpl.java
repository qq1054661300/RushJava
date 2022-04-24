package com.weiyi.authority2;

import com.weiyi.authority.Authority;
import com.weiyi.debug.test;

import static com.weiyi.debug.test.*;
import static com.weiyi.debugoff.test.*;
import static com.weiyi.type.Print.print;

class Connection {
	private static int[] id = {1,2,3};
	private  Connection() {}
	private static Connection c = new Connection();
	public static void get() {
		for (int i = 0; id.length > i; i++) {
			print(id[i]);
		}
	}
}

class ConnectionManager {
	void ConnectionManager() {
		Connection.get();
	}

}

public class AuthorityImpl {
	public static void main(String[] args) {
		Authority authority = new Authority();
		test t = new test();
		t.debug();
		ConnectionManager connectionManager = new ConnectionManager();
	}
}
