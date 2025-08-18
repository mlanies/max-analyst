package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kr2 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;

    public kr2(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
        this.d = rm4Var4;
        this.e = rm4Var5;
        this.f = rm4Var6;
        this.g = rm4Var7;
    }

    public final CharSequence a(e52 e52Var) {
        k92 k92Var;
        f92 f92Var;
        String string;
        uj3 uj3Var;
        List listEmptyList;
        if (e52Var.f0()) {
            return ((ida) this.b.get()).a.getString(jpc.O2);
        }
        ArrayList arrayListJ = e52Var.j();
        if (e52Var.M()) {
            if (arrayListJ.isEmpty()) {
                return null;
            }
            return ((w7b) this.d.get()).b((uj3) arrayListJ.get(0));
        }
        if (e52Var.J()) {
            if (arrayListJ.isEmpty()) {
                if (e52Var.b.c() == 0) {
                    return "";
                }
                if (e52Var.e0() && e52Var.b.c() == 1) {
                    return ((ida) this.b.get()).a.getString(c2c.tt_chat_participants_empty__subtitle);
                }
                return are.s(fzb.tt_chat_subtitle_count, e52Var.b.c(), ((ida) this.b.get()).a);
            }
            int iC = e52Var.b.c();
            if (((ch3) this.a.get()).e() && e52Var.e0() && e52Var.b.e.size() >= e52Var.b.c()) {
                ArrayList arrayListJ2 = e52Var.j();
                u7b u7bVar = (u7b) this.c.get();
                if (arrayListJ2.isEmpty()) {
                    listEmptyList = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListJ2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            if (u7bVar.e(((uj3) next).n())) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    listEmptyList = arrayList;
                }
                int size = listEmptyList.size();
                ida idaVar = (ida) this.b.get();
                idaVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(size + 1);
                sb.append(" ");
                int i = c2c.tt_of;
                Context context = idaVar.a;
                sb.append(context.getString(i));
                sb.append(" ");
                sb.append(iC);
                sb.append(" ");
                sb.append(context.getString(c2c.tt_contact_status_online));
                string = sb.toString();
            } else {
                string = are.s(fzb.tt_chat_subtitle_count, iC, ((ida) this.b.get()).a);
            }
        } else if (e52Var.I()) {
            ida idaVar2 = (ida) this.b.get();
            int iC2 = e52Var.b.c();
            if (iC2 == 0) {
                idaVar2.getClass();
                string = "";
            } else {
                string = are.s(fzb.tt_channel_subtitle_count, iC2, idaVar2.a);
            }
        } else {
            if (e52Var.F()) {
                f92 f92Var2 = e52Var.b.K;
                if (!f92Var2.g) {
                    if (oag.t(f92Var2.e)) {
                        return null;
                    }
                    return String.format(((ida) this.b.get()).a.getString(c2c.tt_chat_admin_group_name_subtitle), e52Var.b.K.e);
                }
                synchronized (e52Var.Z) {
                    try {
                        uj3Var = (!e52Var.F() || e52Var.Z.isEmpty()) ? null : (uj3) e52Var.Z.get(0);
                    } finally {
                    }
                }
                if (uj3Var != null) {
                    return uj3Var.d();
                }
                return null;
            }
            if (!e52Var.Q() || (k92Var = e52Var.b) == null || (f92Var = k92Var.K) == null) {
                return null;
            }
            if (!f92Var.g) {
                ida idaVar3 = (ida) this.b.get();
                idaVar3.getClass();
                boolean zIsEmpty = TextUtils.isEmpty(null);
                Context context2 = idaVar3.a;
                string = !zIsEmpty ? String.format(context2.getString(c2c.tt_chat_group_name_subtitle), null) : context2.getString(c2c.tt_chat_group_subtitle);
            } else {
                if (oag.t(f92Var.e)) {
                    return null;
                }
                ida idaVar4 = (ida) this.b.get();
                String str = e52Var.b.K.e;
                idaVar4.getClass();
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                Context context3 = idaVar4.a;
                string = !zIsEmpty2 ? String.format(context3.getString(c2c.tt_chat_group_name_subtitle), str) : context3.getString(c2c.tt_chat_group_subtitle);
            }
        }
        return string;
    }
}
