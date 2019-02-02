package MyFoodPassion.services;

import MyFoodPassion.models.Post;

import java.util.List;

/**
 * Services – hold the business logic. Often just call some repository method.
 * Example: create new post / show a post for deleting / delete post.
 * Services may have several implementations: DB based or stub based.
 *
 */
public interface PostService {

    List<Post>findAll();
    List<Post> findLatest5();
    Post findById(Long Id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long Id);


}
