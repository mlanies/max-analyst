package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Collections;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class y98 implements km7, fa8, ri8, pj3, rj8, i33, qj3, w5c, grd, pv6, o1d, y2a, mq1, b66, fu3, s0a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y98(zn5 zn5Var) {
        this.a = 29;
        this.b = hz4.a;
        this.c = zn5Var;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = vc7.a;
        boolean zB = vc7.b(vc7.c);
        i50 i50Var = (i50) this.b;
        Context context = (Context) this.c;
        if (zB) {
            int iA = vc7.a(context);
            int i2 = marginLayoutParams.bottomMargin;
            if (i2 < iA) {
                marginLayoutParams.bottomMargin = i2 + iA;
            }
            z = true;
        } else {
            if (!i50Var.b || marginLayoutParams.bottomMargin < vc7.a(context)) {
                marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, x6gVar.a.f(7).d);
            } else {
                marginLayoutParams.bottomMargin -= vc7.a(context);
            }
            z = false;
        }
        i50Var.b = z;
        view.setLayoutParams(marginLayoutParams);
        return x6gVar;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                x4b x4bVar = (x4b) obj;
                sj8 sj8Var = (sj8) this.b;
                sj8Var.getClass();
                j0f j0fVarB = (j0f) this.c;
                if (!j0fVarB.A.isEmpty()) {
                    h0f h0fVarC = j0fVarB.a().c();
                    m5f it = j0fVarB.A.values().iterator();
                    while (it.hasNext()) {
                        c0f c0fVar = (c0f) it.next();
                        rze rzeVar = (rze) sj8Var.g.t0.get(c0fVar.a.b);
                        if (rzeVar == null || c0fVar.a.a != rzeVar.a) {
                            h0fVarC.a(c0fVar);
                        } else {
                            h0fVarC.a(new c0f(rzeVar, c0fVar.b));
                        }
                    }
                    j0fVarB = h0fVarC.b();
                }
                x4bVar.Q(j0fVarB);
                break;
            case 6:
                ii8 ii8Var = (ii8) ((sj8) this.b).c.get();
                if (ii8Var != null && !ii8Var.i()) {
                    ii8Var.g((oh8) this.c, false);
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                ((ActLocalMedias) ((zj9) this.b).c).s0((Uri) obj, (File) this.c, null);
                break;
            case 10:
                tpa.K((m20) obj, (String) this.b, (qj3) this.c);
                break;
            case 11:
                tpa.L((j10) obj, (d20) this.c, ((p7b) ((au8) this.b).c).a.n());
                break;
            case 13:
                tpa.K((m20) obj, (String) this.b, new wp(4, (m56) this.c));
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 26:
                ((p9c) this.b).getClass();
                return p9c.d((d9c) obj, (h9c) this.c);
            default:
                ((p9c) this.b).getClass();
                return p9c.d((d9c) this.c, (h9c) obj);
        }
    }

    @Override // defpackage.ri8
    public void b(oh8 oh8Var) {
        switch (this.a) {
            case 3:
                Bundle bundle = (Bundle) this.c;
                si8 si8Var = (si8) this.b;
                if (bundle == null) {
                    si8Var.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                }
                si8Var.f.m(oh8Var);
                break;
            default:
                si8 si8Var2 = (si8) this.b;
                si8Var2.getClass();
                String str = ((ja8) this.c).a;
                if (TextUtils.isEmpty(str)) {
                    z04.c0("onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    x4b x4bVar = si8Var2.f.s;
                    if (x4bVar.t1(17)) {
                        mue mueVarX0 = x4bVar.x0();
                        kue kueVar = new kue();
                        for (int i = 0; i < mueVarX0.p(); i++) {
                            if (TextUtils.equals(mueVarX0.n(i, kueVar, 0L).c.a, str)) {
                                x4bVar.S(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        z04.c0("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) {
        k4b k4bVar;
        boolean z;
        switch (this.a) {
            case 1:
                if (w98Var.isConnected()) {
                    m4b m4bVar = w98Var.z;
                    m4b m4bVar2 = (m4b) this.b;
                    k4b k4bVar2 = (k4b) this.c;
                    if (m4bVar != null && (k4bVar = w98Var.A) != null) {
                        Pair pairY = j47.Y(m4bVar, k4bVar, m4bVar2, k4bVar2, w98Var.t);
                        m4bVar2 = (m4b) pairY.first;
                        k4bVar2 = (k4b) pairY.second;
                    }
                    w98Var.z = null;
                    w98Var.A = null;
                    if (!w98Var.j.isEmpty()) {
                        w98Var.z = m4bVar2;
                        w98Var.A = k4bVar2;
                        break;
                    } else {
                        m4b m4bVar3 = w98Var.n;
                        m4b m4bVar4 = (m4b) j47.Y(m4bVar3, k4b.c, m4bVar2, k4bVar2, w98Var.t).first;
                        w98Var.n = m4bVar4;
                        Integer numValueOf = (m4bVar3.d.equals(m4bVar2.d) && m4bVar3.e.equals(m4bVar2.e)) ? null : Integer.valueOf(m4bVar4.f);
                        Integer numValueOf2 = !oaf.a(m4bVar3.s(), m4bVar4.s()) ? Integer.valueOf(m4bVar4.b) : null;
                        Integer numValueOf3 = !m4bVar3.j.equals(m4bVar4.j) ? Integer.valueOf(m4bVar4.k) : null;
                        int i = m4bVar3.u;
                        int i2 = m4bVar4.u;
                        w98Var.W0(m4bVar3, m4bVar4, numValueOf3, (i == i2 && m4bVar3.t == m4bVar4.t) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
                        break;
                    }
                }
                break;
            default:
                if (w98Var.isConnected()) {
                    k3b k3bVar = w98Var.r;
                    k3b k3bVar2 = (k3b) this.c;
                    boolean z2 = !oaf.a(k3bVar, k3bVar2);
                    z9d z9dVar = w98Var.q;
                    z9d z9dVar2 = (z9d) this.b;
                    boolean z3 = !oaf.a(z9dVar, z9dVar2);
                    if (z2 || z3) {
                        w98Var.q = z9dVar2;
                        boolean z4 = false;
                        if (z2) {
                            w98Var.r = k3bVar2;
                            k3b k3bVar3 = w98Var.t;
                            k3b k3bVarI = w98.i(k3bVar2, w98Var.s);
                            w98Var.t = k3bVarI;
                            z = !k3bVarI.equals(k3bVar3);
                        } else {
                            z = false;
                        }
                        if (z3 || z) {
                            ffc ffcVar = w98Var.p;
                            ffc ffcVarA = c73.a(w98Var.o, z9dVar2, w98Var.t);
                            w98Var.p = ffcVarA;
                            z4 = !ffcVarA.equals(ffcVar);
                        }
                        if (z) {
                            w98Var.h.f(13, new k98(w98Var, 16));
                        }
                        a98 a98Var = w98Var.a;
                        if (z3) {
                            a98Var.o(new k98(w98Var, z9dVar2));
                        }
                        if (z4) {
                            a98Var.o(new k98(w98Var, 18));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.i33
    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7Var, MotionEvent motionEvent) {
        int i3;
        x77 x77Var;
        ht8 ht8Var = (ht8) this.c;
        long j = ht8Var.J0;
        b69 b69Var = (b69) ((xs8) this.b);
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = b69Var.a;
        messagesListWidget.getClass();
        bc7[] bc7VarArr2 = MessagesListWidget.X0;
        bc7 bc7Var = bc7VarArr2[1];
        long[] jArr = (long[]) messagesListWidget.c.a(messagesListWidget);
        w4d w4dVar = messagesListWidget.J0;
        if (jArr == null || ((x77Var = (x77) w4dVar.T0(messagesListWidget, bc7VarArr2[7])) != null && !x77Var.isActive())) {
            if (messagesListWidget.x0().A().d()) {
                messagesListWidget.x0().A().e(j);
            } else {
                lk7 lk7Var2 = lk7.a;
                View view = ht8Var.I0;
                if (lk7Var == lk7Var2 || lk7Var == lk7.Y) {
                    int i4 = ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1;
                    tx8 tx8VarW = messagesListWidget.x0().w();
                    if (tx8VarW != null) {
                        it8 it8Var = (it8) messagesListWidget.w0.getValue();
                        int iS = au1.s(i4);
                        if (iS == 0) {
                            i3 = 1;
                        } else if (iS == 1) {
                            i3 = 3;
                        } else {
                            if (iS != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = 2;
                        }
                        it8Var.a(j, i3, tx8VarW, 1);
                    }
                    w4dVar.o1(messagesListWidget, bc7VarArr2[7], j47.T(messagesListWidget.getViewLifecycleScope(), null, vx3.b, new z59(j, str, motionEvent, messagesListWidget, i4, lk7Var, (ViewGroup) view, null), 1));
                    return true;
                }
                messagesListWidget.z0(j, view);
            }
        }
        return true;
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) {
        dm4.d(ez9Var, new uy1(new tpc(j47.S(zd6.a, ql4.b.plus((lx3) this.b), vx3.c, new xpc((zn5) ((mn5) this.c), ez9Var, null)))));
    }

    @Override // defpackage.pv6
    public void f(qv6 qv6Var) {
        y7g y7gVar = (y7g) this.b;
        y7gVar.getClass();
        ((pv6) this.c).f(y7gVar);
    }

    @Override // defpackage.o1d
    public int i(int i) {
        int i2 = 4;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr = NotificationsSettingsScreen.v0;
                hdc adapter = ((EndlessRecyclerView2) obj2).getAdapter();
                nd3 nd3Var = adapter instanceof nd3 ? (nd3) adapter : null;
                if (nd3Var != null) {
                    Pair pairD = nd3Var.D(i);
                    Integer num = pairD.first instanceof mfd ? (Integer) pairD.second : -1;
                    mfd mfdVar = ((NotificationsSettingsScreen) obj).X;
                    int iJ = mfdVar.j();
                    int iIntValue = num.intValue();
                    if (iIntValue >= 0 && iIntValue < iJ) {
                        kfd kfdVar = (kfd) ((ol7) mfdVar.C(num.intValue()));
                        if (kfdVar.u() != 0) {
                            if (num.intValue() != mfdVar.j() - 1) {
                                i2 = kfdVar.u() != ((kfd) ((ol7) mfdVar.C(num.intValue() - 1))).u() ? 1 : kfdVar.u() != ((kfd) ((ol7) mfdVar.C(num.intValue() + 1))).u() ? 3 : 2;
                            }
                        }
                        break;
                    }
                }
                break;
            case 18:
            case 19:
            case 20:
            default:
                bc7[] bc7VarArr2 = ProfileScreen.D0;
                int i0 = ((cjb) ((ol7) ((qlb) ((EndlessRecyclerView2) obj2).getAdapter()).C(i))).getI0();
                if (!((bi9) obj).c(i0 & 536870911)) {
                    if ((i0 & 536870912) != 0) {
                        i2 = 1;
                    } else if ((i0 & 1073741824) != 0) {
                        i2 = 2;
                    } else if ((i0 & Integer.MIN_VALUE) != 0) {
                        i2 = 3;
                    }
                    break;
                }
                break;
            case 21:
                int i02 = ((efb) ((ol7) ((ProfileEditAdminPermissionsWidget) obj2).Z.C(i))).getI0();
                if (!((bi9) obj).c(i02 & 536870911)) {
                    if (dy7.A(i02)) {
                        i2 = 1;
                    } else if (dy7.C(i02)) {
                        i2 = 2;
                    } else if (dy7.B(i02)) {
                        i2 = 3;
                    }
                    break;
                }
                break;
            case 22:
                int i03 = ((efb) ((ol7) ((ProfileEditScreen) obj2).X.C(i))).getI0();
                if (!((bi9) obj).c(i03 & 536870911)) {
                    if (dy7.A(i03)) {
                        i2 = 1;
                    } else if (dy7.C(i03)) {
                        i2 = 2;
                    } else if (dy7.B(i03)) {
                        i2 = 3;
                    }
                    break;
                }
                break;
            case 23:
                int i04 = ((cjb) ((ol7) ((ProfileInviteScreen) obj2).o.C(i))).getI0();
                if (!((bi9) obj).c(i04 & 536870911)) {
                    if ((i04 & 536870912) != 0) {
                        i2 = 1;
                    } else if ((i04 & 1073741824) != 0) {
                        i2 = 2;
                    } else if ((i04 & Integer.MIN_VALUE) != 0) {
                        i2 = 3;
                    }
                    break;
                }
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i05 = ((efb) ((ol7) ((ProfileMemberPermissionsScreen) obj2).c.C(i))).getI0();
                if (!((bi9) obj).c(i05 & 536870911)) {
                    if (dy7.A(i05)) {
                        i2 = 1;
                    } else if (dy7.C(i05)) {
                        i2 = 2;
                    } else if (dy7.B(i05)) {
                        i2 = 3;
                    }
                    break;
                }
                break;
        }
        return i2;
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((n3b) obj).G(((Integer) this.c).intValue(), ((m4b) ((ai3) this.b).a).s());
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        Object ee9Var;
        ref refVar;
        bk9 bk9Var = (bk9) this.b;
        p4d p4dVar = bk9Var.X;
        up7 up7Var = (up7) this.c;
        r4d r4dVarH = p4dVar.h(up7Var);
        em5 em5VarU = s36.u(bk9Var.o, Uri.parse(up7Var.a()));
        Point point = (Point) em5VarU.f;
        if (r4dVarH == null || (refVar = r4dVarH.b) == null) {
            ee9Var = new ee9(0L, em5VarU.c, Collections.singletonList(new ce9(point.x, up7Var.a(), point.y, em5VarU.d)), false);
        } else {
            String strA = up7Var.a();
            int i = point.x;
            int i2 = point.y;
            ref refVar2 = r4dVarH.b;
            float f = refVar2.b;
            float f2 = em5VarU.c;
            ee9Var = new w2f(strA, i, i2, em5VarU.d, (long) (f * f2), (long) (refVar2.c * f2), refVar.d);
        }
        nqdVar.a(ee9Var);
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        switch (this.a) {
            case 7:
                return ii8Var.i() ? fm9.F(new sad(-100)) : oaf.g0((bm7) ((rj8) this.b).k(ii8Var, oh8Var, i), new u00(ii8Var, oh8Var, (hj8) this.c, 18));
            default:
                return ii8Var.i() ? fm9.F(new sad(-100)) : oaf.g0((bm7) ((rj8) this.b).k(ii8Var, oh8Var, i), new u00(ii8Var, oh8Var, (qj8) this.c, 19));
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 19:
                fd7 fd7Var = (fd7) this.b;
                mpa mpaVar = (mpa) fd7Var.a;
                if (mpaVar != null) {
                    lq1 lq1Var2 = (lq1) mpaVar.a;
                    Objects.requireNonNull(lq1Var2);
                    lq1Var2.c();
                }
                Object obj = this.c;
                fd7Var.a = new mpa(lq1Var, obj);
                return "PendingValue " + obj;
            default:
                k9b k9bVar = (k9b) this.b;
                ay1 ay1Var = (ay1) this.c;
                synchronized (k9bVar.a) {
                    b76 b76VarA = b76.a(dw6.c);
                    wp wpVar = new wp(6, new c0(5, ay1Var));
                    ok4 ok4VarK = ju0.k();
                    b76VarA.getClass();
                    kq0.a(kq0.K(b76VarA, wpVar, ok4VarK), new wva(lq1Var, 1, ay1Var), ju0.k());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        b9b b9bVar = (b9b) this.b;
        String str = (String) this.c;
        synchronized (b9bVar) {
            ((us) b9bVar.c).remove(str);
        }
        return task;
    }

    public /* synthetic */ y98(si8 si8Var, y9d y9dVar, Bundle bundle) {
        this.a = 3;
        this.b = si8Var;
        this.c = bundle;
    }

    public /* synthetic */ y98(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
