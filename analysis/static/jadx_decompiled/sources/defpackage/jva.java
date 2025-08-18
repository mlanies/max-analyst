package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class jva implements bva, qu7 {
    public final je7 X;
    public final je7 Y;
    public final CopyOnWriteArraySet Z = new CopyOnWriteArraySet();
    public final Context a;
    public final av0 b;
    public final o45 c;
    public final je7 o;
    public final AtomicInteger s0;
    public final q0e t0;
    public final ContextScope u0;
    public boolean v0;

    public jva(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, av0 av0Var, kke kkeVar, o45 o45Var) {
        this.a = context;
        this.b = av0Var;
        this.c = o45Var;
        this.o = je7Var;
        this.X = je7Var2;
        this.Y = je7Var3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.s0 = atomicInteger;
        q0e q0eVarA = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.t0 = q0eVarA;
        ContextScope contextScopeA = j1e.a(new z45(((w9a) kkeVar).d().f(1, "phonebook", 1, 1)).plus(new qj(this)));
        this.u0 = contextScopeA;
        e();
        m58 m58Var = new m58(q0eVarA, 22);
        int i = ft4.o;
        od2.L(new zn5(nu0.Q(m58Var, z7.R(5, kt4.SECONDS)), new dva(this, null), 5), contextScopeA);
    }

    public static final wua b(jva jvaVar, wua wuaVar, List list) {
        jvaVar.getClass();
        Long lD = d(wuaVar.X);
        Object obj = null;
        if (lD != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (lD.equals(d(((wua) next).X))) {
                    obj = next;
                    break;
                }
            }
            return (wua) obj;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (tpa.f(wuaVar.X, ((wua) next2).X)) {
                obj = next2;
                break;
            }
        }
        return (wua) obj;
    }

    public static Long d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        char cCharAt2 = string.charAt(0);
        if (cCharAt2 != '7') {
            if (cCharAt2 != '8') {
                return null;
            }
            string = "7".concat(w9e.r0(1, string));
        }
        return dae.f0(string);
    }

    @Override // defpackage.qu7
    public final void a() {
        j1e.i(this.u0, null);
    }

    public final void c() {
        Object value;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "Phonebook", "call checkUpdates from: ".concat(j47.n0(new RuntimeException())), null);
        }
        q0e q0eVar = this.t0;
        do {
            value = q0eVar.getValue();
            ((Number) value).intValue();
        } while (!q0eVar.c(value, Integer.valueOf(this.s0.incrementAndGet())));
    }

    public final void e() {
        if (!((eua) ((f6a) this.X.getValue()).a.getValue()).b(eua.f)) {
            hm9.n("Phonebook", "subscribeOnSystemChanges: no permissions, return");
        } else {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new f04(this, new Handler(Looper.getMainLooper())));
        }
    }
}
