package com.telusko.jobslisting;

import com.telusko.jobslisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository  extends MongoRepository<Post, String> {

}
