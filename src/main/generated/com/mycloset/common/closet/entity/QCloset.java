package com.mycloset.common.closet.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCloset is a Querydsl query type for Closet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCloset extends EntityPathBase<Closet> {

    private static final long serialVersionUID = -1853111617L;

    public static final QCloset closet = new QCloset("closet");

    public final StringPath COLOR = createString("COLOR");

    public final StringPath ctgL = createString("ctgL");

    public final StringPath ctgM = createString("ctgM");

    public final StringPath FILTER = createString("FILTER");

    public final StringPath FILTER2 = createString("FILTER2");

    public final StringPath MEMO = createString("MEMO");

    public final DateTimePath<java.time.Instant> REGDATE = createDateTime("REGDATE", java.time.Instant.class);

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final DateTimePath<java.time.Instant> UPDDATE = createDateTime("UPDDATE", java.time.Instant.class);

    public final StringPath userId = createString("userId");

    public QCloset(String variable) {
        super(Closet.class, forVariable(variable));
    }

    public QCloset(Path<? extends Closet> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCloset(PathMetadata metadata) {
        super(Closet.class, metadata);
    }

}

