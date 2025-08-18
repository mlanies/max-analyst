package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a14;
import defpackage.ah4;
import defpackage.dc3;
import defpackage.ip0;
import defpackage.kh7;
import defpackage.le0;
import defpackage.le7;
import defpackage.lqb;
import defpackage.nb3;
import defpackage.ob8;
import defpackage.s4f;
import defpackage.ta4;
import defpackage.u04;
import defpackage.u4f;
import defpackage.zb3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final le7 BG_EXECUTOR = new le7(new dc3(1));
    static final le7 LITE_EXECUTOR = new le7(new dc3(2));
    static final le7 BLOCKING_EXECUTOR = new le7(new dc3(3));
    static final le7 SCHEDULER = new le7(new dc3(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new u04(str, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(zb3 zb3Var) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(zb3 zb3Var) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(zb3 zb3Var) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor lambda$getComponents$7(zb3 zb3Var) {
        return s4f.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        return scheduled(Executors.newFixedThreadPool(4, factory("Firebase Background", 10, bgPolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        return scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), factory("Firebase Lite", 0, litePolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$2() {
        return scheduled(Executors.newCachedThreadPool(factory("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return Executors.newSingleThreadScheduledExecutor(factory("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new ah4(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nb3> getComponents() {
        lqb lqbVar = new lqb(le0.class, ScheduledExecutorService.class);
        lqb[] lqbVarArr = {new lqb(le0.class, ExecutorService.class), new lqb(le0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqbVar);
        for (lqb lqbVar2 : lqbVarArr) {
            a14.h(lqbVar2, "Null interface");
        }
        Collections.addAll(hashSet, lqbVarArr);
        nb3 nb3Var = new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ta4(11), hashSet3);
        lqb lqbVar3 = new lqb(ip0.class, ScheduledExecutorService.class);
        lqb[] lqbVarArr2 = {new lqb(ip0.class, ExecutorService.class), new lqb(ip0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(lqbVar3);
        for (lqb lqbVar4 : lqbVarArr2) {
            a14.h(lqbVar4, "Null interface");
        }
        Collections.addAll(hashSet4, lqbVarArr2);
        nb3 nb3Var2 = new nb3(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ta4(12), hashSet6);
        lqb lqbVar5 = new lqb(kh7.class, ScheduledExecutorService.class);
        lqb[] lqbVarArr3 = {new lqb(kh7.class, ExecutorService.class), new lqb(kh7.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(lqbVar5);
        for (lqb lqbVar6 : lqbVarArr3) {
            a14.h(lqbVar6, "Null interface");
        }
        Collections.addAll(hashSet7, lqbVarArr3);
        nb3 nb3Var3 = new nb3(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new ta4(13), hashSet9);
        ob8 ob8VarA = nb3.a(new lqb(u4f.class, Executor.class));
        ob8VarA.f = new ta4(14);
        return Arrays.asList(nb3Var, nb3Var2, nb3Var3, ob8VarA.b());
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new u04(str, i, threadPolicy);
    }
}
