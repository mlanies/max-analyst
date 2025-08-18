package defpackage;

import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ai0 implements a66 {
    public final /* synthetic */ int a;

    public /* synthetic */ ai0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        k92 k92Var;
        k92 k92Var2;
        k92 k92Var3;
        k92 k92Var4;
        uj3 uj3VarL;
        uj3 uj3VarL2;
        int i = 0;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                it2 it2Var = (it2) obj;
                it2 it2Var2 = (it2) obj2;
                boolean z6 = it2Var instanceof ht2;
                ht2 ht2Var = ht2.a;
                if (z6 || (it2Var2 instanceof ht2)) {
                    return ht2Var;
                }
                if (!(it2Var instanceof gt2) || !(it2Var2 instanceof gt2)) {
                    if (it2Var2 instanceof gt2) {
                        throw new IllegalStateException("Unreachable");
                    }
                    if (it2Var2.equals(ht2Var)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xs xsVar = new xs(0);
                gt2 gt2Var = (gt2) it2Var;
                xsVar.addAll(gt2Var.a);
                gt2 gt2Var2 = (gt2) it2Var2;
                xsVar.addAll(gt2Var2.a);
                if (!gt2Var.b && !gt2Var2.b) {
                    z5 = false;
                }
                xs xsVar2 = new xs(0);
                xsVar2.addAll(gt2Var.c);
                xsVar2.addAll(gt2Var2.c);
                return new gt2(xsVar, z5, xsVar2);
            case 1:
                return e5f.a;
            case 2:
                gi9 gi9Var = ((mm3) obj).a;
                int i2 = gi9Var.d;
                gi9 gi9Var2 = ((mm3) obj2).a;
                gi9 gi9Var3 = new gi9(i2 + gi9Var2.d);
                gi9Var3.b(gi9Var);
                gi9Var3.b(gi9Var2);
                return new mm3(gi9Var3);
            case 3:
                return Boolean.valueOf(((pqa) obj).a.a.r() == ((pqa) obj2).a.a.r());
            case 4:
                return Boolean.valueOf(((pqa) obj).a.a.r() == ((pqa) obj2).a.a.r());
            case 5:
                e52 e52Var = (e52) obj;
                e52 e52Var2 = (e52) obj2;
                if (tpa.f((e52Var == null || (k92Var4 = e52Var.b) == null) ? null : Integer.valueOf(k92Var4.c()), (e52Var2 == null || (k92Var3 = e52Var2.b) == null) ? null : Integer.valueOf(k92Var3.c()))) {
                    Integer numValueOf = (e52Var == null || (k92Var2 = e52Var.b) == null) ? null : Integer.valueOf(k92Var2.m);
                    if (e52Var2 != null && (k92Var = e52Var2.b) != null) {
                        objValueOf = Integer.valueOf(k92Var.m);
                    }
                    if (tpa.f(numValueOf, objValueOf)) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 6:
                e52 e52Var3 = (e52) obj;
                e52 e52Var4 = (e52) obj2;
                uj3 uj3VarL3 = e52Var3.l();
                Long lValueOf = uj3VarL3 != null ? Long.valueOf(uj3VarL3.n()) : null;
                uj3 uj3VarL4 = e52Var4.l();
                if (tpa.f(lValueOf, uj3VarL4 != null ? Long.valueOf(uj3VarL4.n()) : null) && e52Var3.H() == e52Var4.H() && tpa.f(e52Var3.p(), e52Var4.p()) && e52Var3.f() == e52Var4.f()) {
                    if ((e52Var3.X() || ((uj3VarL2 = e52Var3.l()) != null && uj3VarL2.u())) == (e52Var4.X() || ((uj3VarL = e52Var4.l()) != null && uj3VarL.u()))) {
                        e52Var3.l0();
                        CharSequence charSequence = e52Var3.x0;
                        e52Var4.l0();
                        if (tpa.f(charSequence, e52Var4.x0)) {
                            e52Var3.k0();
                            CharSequence charSequence2 = e52Var3.u0;
                            e52Var4.k0();
                            if (tpa.f(charSequence2, e52Var4.u0) && e52Var3.b.a == e52Var4.b.a) {
                                k10 k10VarR = e52Var3.r();
                                String str = k10VarR != null ? k10VarR.c : null;
                                k10 k10VarR2 = e52Var4.r();
                                if (tpa.f(str, k10VarR2 != null ? k10VarR2.c : null)) {
                                    kk0 kk0Var = kk0.b;
                                    jk0 jk0Var = jk0.a;
                                    if (tpa.f(e52Var3.g(kk0Var, jk0Var), e52Var4.g(kk0Var, jk0Var))) {
                                        z3 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 7:
                hm9.n((String) obj, (String) obj2);
                return e5f.a;
            case 8:
                gi9 gi9Var4 = ((mm3) obj).a;
                int i3 = gi9Var4.d;
                gi9 gi9Var5 = ((mm3) obj2).a;
                gi9 gi9Var6 = new gi9(i3 + gi9Var5.d);
                gi9Var6.b(gi9Var4);
                gi9Var6.b(gi9Var5);
                return new mm3(gi9Var6);
            case 9:
                return obj;
            case 10:
                return new wd3(obj, obj2);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((lx3) obj).plus((jx3) obj2);
            case 13:
                return ((lx3) obj).plus((jx3) obj2);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Boolean.valueOf(((h8f) obj2).a <= ((h8f) obj).a);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Boolean.valueOf(tpa.f(obj, obj2));
            case 16:
                return Integer.valueOf(np8.j(((es8) obj).a.o, ((es8) obj2).a.o));
            case LangUtils.HASH_SEED /* 17 */:
                cn8 cn8Var = (cn8) obj2;
                boolean z7 = ((cn8) obj) instanceof cn8;
                cn8 cn8Var2 = cn8.a;
                if (z7 || (cn8Var instanceof cn8)) {
                    return cn8Var2;
                }
                if (cn8Var.equals(cn8Var2)) {
                    throw new IllegalStateException("Unreachable");
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                uj3 uj3Var = (uj3) obj;
                uj3 uj3Var2 = (uj3) obj2;
                return Boolean.valueOf(tpa.f(uj3Var != null ? uj3Var.a.c.w : null, uj3Var2 != null ? uj3Var2.a.c.w : null));
            case 19:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                y53.R();
                                throw null;
                            }
                            nl2 nl2Var = (nl2) next;
                            nl2 nl2Var2 = (nl2) list2.get(i4);
                            if (nl2Var.a == nl2Var2.a && tpa.f(nl2Var.c, nl2Var2.c)) {
                                CharSequence charSequence3 = nl2Var.X;
                                int iF = charSequence3 instanceof Spanned ? wmd.f((Spanned) charSequence3) : charSequence3.hashCode();
                                CharSequence charSequence4 = nl2Var2.X;
                                if (iF == (charSequence4 instanceof Spanned ? wmd.f((Spanned) charSequence4) : charSequence4.hashCode()) && tpa.f(nl2Var.Y, nl2Var2.Y) && tpa.f(nl2Var.s0, nl2Var2.s0) && nl2Var.v0 == nl2Var2.v0 && nl2Var.w0 == nl2Var2.w0 && nl2Var.x0 == nl2Var2.x0 && nl2Var.y0 == nl2Var2.y0 && nl2Var.z0 == nl2Var2.z0 && nl2Var.A0 == nl2Var2.A0 && nl2Var.B0 == nl2Var2.B0 && tpa.f(nl2Var.C0, nl2Var2.C0) && tpa.f(nl2Var.b, nl2Var2.b) && nl2Var.D0 == nl2Var2.D0) {
                                    i4 = i5;
                                }
                            }
                        } else {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 20:
                gi9 gi9Var7 = ((mm3) obj).a;
                int i6 = gi9Var7.d;
                gi9 gi9Var8 = ((mm3) obj2).a;
                gi9 gi9Var9 = new gi9(i6 + gi9Var8.d);
                gi9Var9.b(gi9Var7);
                gi9Var9.b(gi9Var8);
                return new mm3(gi9Var9);
            case 21:
                bc7[] bc7VarArr = PickerChatsTabWidget.y0;
                return e5f.a;
            case 22:
                e52 e52Var5 = (e52) obj;
                e52 e52Var6 = (e52) obj2;
                if (tpa.f(e52Var5.X, e52Var6.X) && e52Var5.w() == e52Var6.w()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                gi9 gi9Var10 = ((mm3) obj).a;
                int i7 = gi9Var10.d;
                gi9 gi9Var11 = ((mm3) obj2).a;
                gi9 gi9Var12 = new gi9(i7 + gi9Var11.d);
                gi9Var12.b(gi9Var10);
                gi9Var12.b(gi9Var11);
                return new mm3(gi9Var12);
            case 25:
                return e5f.a;
            case 26:
                return e5f.a;
            case 27:
                long j = ((w9d) obj).a;
                long j2 = ((w9d) obj2).a;
                if (j > j2) {
                    i = -1;
                } else if (j != j2) {
                    i = 1;
                }
                return Integer.valueOf(i);
            default:
                return Boolean.valueOf(((v6f) obj2).e <= ((v6f) obj).e);
        }
    }
}
