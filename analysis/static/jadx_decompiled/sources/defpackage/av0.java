package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class av0 {
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final String c;
    public final lq9 d;
    public final hx9 e;
    public final yu0 f;
    public final yu0 g;
    public final ConcurrentHashMap h;

    public av0() {
        lq9 lq9Var = lq9.Y;
        hx9 hx9Var = hx9.s0;
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new yu0(0);
        this.g = new yu0(1);
        this.h = new ConcurrentHashMap();
        this.d = lq9Var;
        this.c = "default";
        this.e = hx9Var;
    }

    public static void a(Object obj, t35 t35Var) throws IllegalAccessException, IllegalArgumentException {
        try {
            t35Var.a(obj);
        } catch (InvocationTargetException e) {
            e("Could not dispatch event: " + obj.getClass() + " to handler " + t35Var, e);
            throw null;
        }
    }

    public static void b(t35 t35Var, e45 e45Var) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objA = e45Var.a();
            if (objA == null) {
                return;
            }
            a(objA, t35Var);
        } catch (InvocationTargetException e) {
            e("Producer " + e45Var + " threw an exception.", e);
            throw null;
        }
    }

    public static void e(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder sbO = rh4.o(str, ": ");
            sbO.append(cause.getMessage());
            throw new RuntimeException(sbO.toString(), cause);
        }
        StringBuilder sbO2 = rh4.o(str, ": ");
        sbO2.append(invocationTargetException.getMessage());
        throw new RuntimeException(sbO2.toString(), invocationTargetException);
    }

    public void c(Object obj) {
        yu0 yu0Var;
        if (obj == null) {
            throw new NullPointerException("Event to post must not be null.");
        }
        cy7 cy7Var = (cy7) this;
        this.d.b(cy7Var);
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.h;
        Set set = (Set) concurrentHashMap.get(cls);
        boolean z = false;
        if (set == null) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            set = (Set) concurrentHashMap.putIfAbsent(cls, hashSet);
            if (set == null) {
                set = hashSet;
            }
        }
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            yu0Var = this.f;
            if (!zHasNext) {
                break;
            }
            Set set2 = (Set) this.a.get((Class) it.next());
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((ConcurrentLinkedQueue) yu0Var.get()).offer(new zu0(obj, (t35) it2.next()));
                }
                z = true;
            }
        }
        if (!z && !(obj instanceof d44)) {
            c(new d44(cy7Var, obj));
        }
        yu0 yu0Var2 = this.g;
        if (((Boolean) yu0Var2.get()).booleanValue()) {
            return;
        }
        yu0Var2.set(Boolean.TRUE);
        while (true) {
            try {
                zu0 zu0Var = (zu0) ((ConcurrentLinkedQueue) yu0Var.get()).poll();
                if (zu0Var == null) {
                    return;
                }
                t35 t35Var = zu0Var.b;
                if (t35Var.d) {
                    a(zu0Var.a, t35Var);
                }
            } finally {
                yu0Var2.set(Boolean.FALSE);
            }
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object to register must not be null.");
        }
        this.d.b((cy7) this);
        hx9 hx9Var = this.e;
        HashMap mapO = hx9Var.o(obj);
        Iterator it = mapO.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ConcurrentHashMap concurrentHashMap = this.b;
            ConcurrentHashMap concurrentHashMap2 = this.a;
            if (!zHasNext) {
                HashMap mapP = hx9Var.p(obj);
                for (Class cls : mapP.keySet()) {
                    Set copyOnWriteArraySet = (Set) concurrentHashMap2.get(cls);
                    if (copyOnWriteArraySet == null) {
                        copyOnWriteArraySet = new CopyOnWriteArraySet();
                        Set set = (Set) concurrentHashMap2.putIfAbsent(cls, copyOnWriteArraySet);
                        if (set != null) {
                            copyOnWriteArraySet = set;
                        }
                    }
                    if (!copyOnWriteArraySet.addAll((Set) mapP.get(cls))) {
                        throw new IllegalArgumentException("Object already registered.");
                    }
                }
                for (Map.Entry entry : mapP.entrySet()) {
                    e45 e45Var = (e45) concurrentHashMap.get((Class) entry.getKey());
                    if (e45Var != null && e45Var.d) {
                        for (t35 t35Var : (Set) entry.getValue()) {
                            if (!e45Var.d) {
                                break;
                            } else if (t35Var.d) {
                                b(t35Var, e45Var);
                            }
                        }
                    }
                }
                return;
            }
            Class cls2 = (Class) it.next();
            e45 e45Var2 = (e45) mapO.get(cls2);
            e45 e45Var3 = (e45) concurrentHashMap.putIfAbsent(cls2, e45Var2);
            if (e45Var3 != null) {
                throw new IllegalArgumentException("Producer method for type " + cls2 + " found on type " + e45Var2.a.getClass() + ", but already registered by type " + e45Var3.a.getClass() + ".");
            }
            Set set2 = (Set) concurrentHashMap2.get(cls2);
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    b((t35) it2.next(), e45Var2);
                }
            }
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        this.d.b((cy7) this);
        hx9 hx9Var = this.e;
        for (Map.Entry entry : hx9Var.o(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            ConcurrentHashMap concurrentHashMap = this.b;
            e45 e45Var = (e45) concurrentHashMap.get(cls);
            e45 e45Var2 = (e45) entry.getValue();
            if (e45Var2 == null || !e45Var2.equals(e45Var)) {
                throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
            }
            ((e45) concurrentHashMap.remove(cls)).d = false;
        }
        for (Map.Entry entry2 : hx9Var.p(obj).entrySet()) {
            Set<t35> set = (Set) this.a.get((Class) entry2.getKey());
            Collection<?> collection = (Collection) entry2.getValue();
            if (set == null || !set.containsAll(collection)) {
                throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
            }
            for (t35 t35Var : set) {
                if (collection.contains(t35Var)) {
                    t35Var.d = false;
                }
            }
            set.removeAll(collection);
        }
    }

    public final String toString() {
        return zr6.l(new StringBuilder("[Bus \""), this.c, "\"]");
    }
}
