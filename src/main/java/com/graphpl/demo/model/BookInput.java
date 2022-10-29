package com.graphpl.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BookInput {

	private String name;
	private String author;
	private String desc;
	private String publishedDate;
}
