/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_objectpresistence;

/**
 *
 * @author Pamungkas
 */
import java.io.Serializable;

public class Barang implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String description;

	Barang() {
	};

	Barang(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return name +"\n" + description;
	}
}
