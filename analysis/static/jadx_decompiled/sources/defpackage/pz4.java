package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* loaded from: classes2.dex */
public final class pz4 extends jdc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pz4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jdc
    public void a() {
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) this.b).F0();
                break;
            case 2:
                ((pz7) this.b).f(true);
                break;
            case 3:
                ((ng6) this.b).a();
                break;
            case 4:
                cn9 cn9Var = (cn9) this.b;
                cn9Var.e = cn9Var.c.j();
                od3 od3Var = cn9Var.d;
                ((nd3) od3Var.e).m();
                od3Var.c();
                break;
            case 5:
                ((RecyclerAutofitGridView) this.b).F0();
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                recyclerView.s1.g = true;
                recyclerView.k0(true);
                if (!recyclerView.s0.D()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 8:
                ((xu3) this.b).s();
                break;
        }
    }

    @Override // defpackage.jdc
    public void b(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ng6) this.b).a();
                break;
            case 4:
                cn9 cn9Var = (cn9) this.b;
                od3 od3Var = cn9Var.d;
                ((nd3) od3Var.e).o(i + od3Var.d(cn9Var), i2, null);
                break;
            case 7:
                ((k56) this.b).invoke();
                break;
            case 8:
                ((xu3) this.b).s();
                break;
        }
    }

    @Override // defpackage.jdc
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ng6) this.b).a();
                break;
            case 4:
                cn9 cn9Var = (cn9) this.b;
                od3 od3Var = cn9Var.d;
                ((nd3) od3Var.e).o(i + od3Var.d(cn9Var), i2, obj);
                break;
            case 5:
            default:
                super.c(i, i2, obj);
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                x8 x8Var = recyclerView.s0;
                if (i2 >= 1) {
                    ArrayList arrayList = (ArrayList) x8Var.c;
                    arrayList.add(x8Var.G(obj, 4, i, i2));
                    x8Var.a |= 4;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                } else {
                    x8Var.getClass();
                    break;
                }
                break;
            case 7:
                ((k56) this.b).invoke();
                break;
            case 8:
                ((xu3) this.b).s();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    @Override // defpackage.jdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz4.d(int, int):void");
    }

    @Override // defpackage.jdc
    public void e(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ng6) this.b).a();
                break;
            case 4:
                cn9 cn9Var = (cn9) this.b;
                od3 od3Var = cn9Var.d;
                int iD = od3Var.d(cn9Var);
                ((nd3) od3Var.e).n(i + iD, i2 + iD);
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                x8 x8Var = recyclerView.s0;
                x8Var.getClass();
                if (i != i2) {
                    ArrayList arrayList = (ArrayList) x8Var.c;
                    arrayList.add(x8Var.G(null, 8, i, i2));
                    x8Var.a |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                }
                break;
            case 7:
                ((k56) this.b).invoke();
                break;
            case 8:
                ((xu3) this.b).s();
                break;
        }
    }

    @Override // defpackage.jdc
    public void f(int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) obj).F0();
                break;
            case 1:
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                if (((ov2) chatsListSearchScreen.n0().F0.a.getValue()).d.isEmpty()) {
                    ((EndlessRecyclerView2) chatsListSearchScreen.G0.T0(chatsListSearchScreen, ChatsListSearchScreen.J0[3])).setRefreshingNext(false);
                    break;
                }
                break;
            case 2:
                a();
                break;
            case 3:
                ((ng6) obj).a();
                break;
            case 4:
                cn9 cn9Var = (cn9) obj;
                cn9Var.e -= i2;
                od3 od3Var = cn9Var.d;
                ((nd3) od3Var.e).a.f(i + od3Var.d(cn9Var), i2);
                if (cn9Var.e < 1 && cn9Var.c.c == 2) {
                    od3Var.c();
                    break;
                }
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n(null);
                x8 x8Var = recyclerView.s0;
                if (i2 >= 1) {
                    ArrayList arrayList = (ArrayList) x8Var.c;
                    arrayList.add(x8Var.G(null, 2, i, i2));
                    x8Var.a |= 2;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                } else {
                    x8Var.getClass();
                    break;
                }
                break;
            case 7:
                ((k56) obj).invoke();
                break;
            case 8:
                ((xu3) obj).s();
                break;
        }
    }

    @Override // defpackage.jdc
    public void g() {
        hdc hdcVar;
        switch (this.a) {
            case 4:
                ((cn9) this.b).d.c();
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.o != null && (hdcVar = recyclerView.A0) != null) {
                    int iS = au1.s(hdcVar.c);
                    if (iS != 1) {
                        if (iS == 2) {
                        }
                    } else if (hdcVar.j() <= 0) {
                    }
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void h() {
        boolean z = RecyclerView.Q1;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (z && recyclerView.H0 && recyclerView.G0) {
            WeakHashMap weakHashMap = zmf.a;
            recyclerView.postOnAnimation(recyclerView.w0);
        } else {
            recyclerView.O0 = true;
            recyclerView.requestLayout();
        }
    }
}
