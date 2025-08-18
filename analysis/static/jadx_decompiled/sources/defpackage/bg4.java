package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.firebase.components.DependencyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import org.webrtc.EglBase;
import org.webrtc.NativeDoubleArrayConsumer;

/* loaded from: classes.dex */
public final class bg4 implements zb3, Provider {
    public static bg4 Z;
    public Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object o;

    public bg4() {
        this.a = 0;
        this.b = new Object();
        this.Y = new re(13, this);
        this.o = new ArrayList();
        this.X = new ArrayList();
        this.c = new Handler(Looper.getMainLooper());
    }

    public static synchronized bg4 h() {
        try {
            if (Z == null) {
                Z = new bg4();
            }
        } catch (Throwable th) {
            throw th;
        }
        return Z;
    }

    @Override // defpackage.zb3
    public Object a(Class cls) {
        if (!((Set) this.b).contains(lqb.a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((zb3) this.Y).a(cls);
        if (!cls.equals(zpb.class)) {
            return objA;
        }
        return new gjc();
    }

    @Override // defpackage.zb3
    public Set b(lqb lqbVar) {
        if (((Set) this.o).contains(lqbVar)) {
            return ((zb3) this.Y).b(lqbVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + lqbVar + ">.");
    }

    @Override // defpackage.zb3
    public gpb c(Class cls) {
        return e(lqb.a(cls));
    }

    @Override // defpackage.zb3
    public gpb d(lqb lqbVar) {
        if (((Set) this.X).contains(lqbVar)) {
            return ((zb3) this.Y).d(lqbVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + lqbVar + ">>.");
    }

    @Override // defpackage.zb3
    public gpb e(lqb lqbVar) {
        if (((Set) this.c).contains(lqbVar)) {
            return ((zb3) this.Y).e(lqbVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + lqbVar + ">.");
    }

    @Override // defpackage.zb3
    public Object f(lqb lqbVar) {
        if (((Set) this.b).contains(lqbVar)) {
            return ((zb3) this.Y).f(lqbVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + lqbVar + ".");
    }

    public void g(ag4 ag4Var) {
        synchronized (this.b) {
            ((ArrayList) this.o).remove(ag4Var);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new o2f((d9f) ((Provider) this.b).get(), (d9f) ((Provider) this.c).get(), (ytc) ((Provider) this.o).get(), (t8f) ((Provider) this.X).get(), (o7g) ((Provider) this.Y).get());
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.o) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.X;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public bg4(py0 py0Var, qld qldVar, a4c a4cVar, o9g o9gVar, bi biVar, ji9 ji9Var, EglBase eglBase) {
        this.a = 1;
        this.b = a4cVar;
        this.c = biVar;
        kad kadVar = new kad(1);
        this.o = kadVar;
        qz7 qz7Var = new qz7(this, qldVar, biVar, kadVar);
        this.X = qz7Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Y = new pi(this, new qq9(), biVar, eglBase, kadVar);
        ync yncVar = new ync(1, this);
        if (!tpa.f((NativeDoubleArrayConsumer.Consumer) qz7Var.c, yncVar)) {
            qz7Var.c = yncVar;
            ((AtomicInteger) kadVar.Z).set(0);
        }
        copyOnWriteArraySet.add(new lq9(this));
    }

    public bg4(x3c x3cVar, qp4 qp4Var, die dieVar) {
        this.a = 6;
        c32 c32Var = z04.c;
        nd2 nd2Var = a14.g;
        this.b = c32Var;
        this.c = nd2Var;
        this.o = x3cVar;
        this.X = qp4Var;
        this.Y = dieVar;
    }

    public bg4(nb3 nb3Var, zb3 zb3Var) {
        this.a = 5;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (nh4 nh4Var : nb3Var.c) {
            int i = nh4Var.c;
            boolean z = i == 0;
            int i2 = nh4Var.b;
            lqb lqbVar = nh4Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(lqbVar);
                } else {
                    hashSet.add(lqbVar);
                }
            } else if (i == 2) {
                hashSet3.add(lqbVar);
            } else if (i2 == 2) {
                hashSet5.add(lqbVar);
            } else {
                hashSet2.add(lqbVar);
            }
        }
        if (!nb3Var.g.isEmpty()) {
            hashSet.add(lqb.a(zpb.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.o = Collections.unmodifiableSet(hashSet4);
        this.X = Collections.unmodifiableSet(hashSet5);
        this.Y = zb3Var;
    }

    public bg4(String str, String str2, String str3, List list) {
        this.a = 3;
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        this.o = str3;
        list.getClass();
        this.X = list;
        this.Y = str + "-" + str2 + "-" + str3;
    }

    public bg4(String str) {
        this.a = 2;
        this.b = nz4.a;
        this.o = new ArrayList();
        new HashSet();
        this.X = new ArrayList();
        this.c = new ArrayList();
        this.Y = new ArrayList();
    }

    public bg4(v4 v4Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = 4;
        this.b = v4Var;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        this.Y = je7Var4;
    }
}
