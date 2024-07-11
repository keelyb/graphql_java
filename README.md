# SETUP
- Install VSCode 
- Install java17
- Install the SpringBoot Dashboard extension

# BUILD
- Clean and package the source:
 ~~~
 ./mvnw clean package -e
 ~~~

 # RUN
- Open the Springboot Dashboard and click "Run without Debugging" or F5.

- Open graphiql dashboard: http://localhost:8080/graphiql?path=/graphql%20%20
- Enter a query as below and then click RUN
~~~
query bookDetails {
	audioBookById( id: "audiobook-1" ) {
		id
    name
    listeningLength
    audibleComReleaseDate
    publisher
    programType
    language
    bestSellerRank
    author {
      id
      firstName
      lastName
    }
  }

  videoById (id: "video-1") {
    id
    name
    durationMinutes
    author {
      id
      firstName
      lastName
    }
  }
  
  bookById( id: "book-1" ) {
		id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}
~~~


# SCREENSHOTS

![image](https://github.com/keelyb/graphql_java/assets/7407493/237a2d52-1bc7-4cca-9d0e-4b1ea8fdf588)


# REFERENECES

- https://graphql.org/learn/schema/
