package com.base.project.api.categories;

import com.base.project.usecase.findallcategories.FindAllCategoriesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class CategoryHandler {

    private final FindAllCategoriesUseCase useCase;

    public Mono<ServerResponse> getAll(ServerRequest serverRequest) {
        return useCase.findAll()
                .collectList()
                .flatMap(categories -> ServerResponse.ok().bodyValue(categories));
    }
}
