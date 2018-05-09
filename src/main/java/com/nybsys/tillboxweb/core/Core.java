package com.nybsys.tillboxweb.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Core {

    public static final AtomicLong numberOfRequestServe = new AtomicLong(0);

    public static final AtomicLong numberOfRequestServeNotServe = new AtomicLong(0);


    public static final int QoS=0;

    public static final List messageIdList; //= new ArrayList<>();

    private ArrayList finishingOrder;

    static
    {
        messageIdList = Collections.synchronizedList(new ArrayList<String>());
    }
    //public final static List<Condition> brokerMessageIdList = new ArrayList<>();
    public final static ObjectMapper jsonMapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);;

    //public final static Object brokerLockObject = new Object();
    // A common lock for synchronization
    public final static Lock callBackLock = new ReentrantLock();
    //public static Condition joeArrival = callBackLock.newCondition();
    public final static Object callBackRemoveLock = new Object();

    public static final ConcurrentHashMap<String, Condition> clientLockWithMessageId = new ConcurrentHashMap<String, Condition>();

    public String getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
