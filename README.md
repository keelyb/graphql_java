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

