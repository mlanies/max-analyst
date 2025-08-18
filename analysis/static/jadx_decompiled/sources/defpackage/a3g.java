package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class a3g extends ppd {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3g(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.ppd
    /* renamed from: H */
    public void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 0:
                if (hqdVar instanceof y2g) {
                    y2g y2gVar = (y2g) hqdVar;
                    y2gVar.A((ol7) C(i));
                    x2g x2gVar = (x2g) this.Y;
                    v7d v7dVar = new v7d(y2gVar, 17, x2gVar);
                    View view = y2gVar.a;
                    tu0.K(view, 300L, v7dVar);
                    ((ufd) view).setOnSwitchCheckedListener(new en3(y2gVar, 3, x2gVar));
                    return;
                }
                if (hqdVar instanceof z2g) {
                    z2g z2gVar = (z2g) hqdVar;
                    ol7 ol7Var = (ol7) C(i);
                    om8 om8Var = new om8(1, (x2g) this.Y, x2g.class, "onItemClick", "onItemClick(Lone/me/webapp/model/WebAppsSectionItem;)V", 0, 22);
                    z2gVar.A(ol7Var);
                    tu0.K(z2gVar.a, 300L, new v7d(z2gVar, 18, om8Var));
                    return;
                }
                return;
            case 1:
                ub ubVar = (ub) hqdVar;
                ba baVar = (ba) ((ol7) C(i));
                l lVar = new l(6, this);
                ubVar.A(baVar);
                ((lk3) ubVar.a).setOnClickListener(new tb(lVar, 0, baVar));
                return;
            case 2:
                ((mh0) hqdVar).A((ch0) ((ol7) C(i)));
                return;
            case 3:
                J((zn3) hqdVar, i);
                return;
            case 4:
                vy3 vy3Var = (vy3) hqdVar;
                uy3 uy3Var = (uy3) ((ol7) C(i));
                jy2 jy2Var = new jy2(8, this);
                vy3Var.A(uy3Var);
                ((LinearLayout) vy3Var.a).setOnClickListener(new tb(jy2Var, 27, uy3Var));
                return;
            case 5:
                int i0 = ((fb5) ((ol7) C(i))).getI0();
                int i2 = p8a.u;
                iv ivVar = this.o;
                if (i0 == i2) {
                    db5 db5Var = (db5) hqdVar;
                    fb5 fb5Var = (fb5) ivVar.f.get(i);
                    f fVar = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 18);
                    vw vwVar = new vw(2, (ib5) this.Y, ib5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 18);
                    f fVar2 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 19);
                    db5Var.A(fb5Var);
                    m62 m62Var = (m62) db5Var.a;
                    tu0.K(m62Var, 300L, new bz0(fb5Var, fVar, fVar2, 1));
                    m62Var.setOnLongClickListener(new z52(vwVar, fb5Var, db5Var, 6));
                    return;
                }
                if (i0 == p8a.v) {
                    hb5 hb5Var = (hb5) hqdVar;
                    fb5 fb5Var2 = (fb5) ivVar.f.get(i);
                    f fVar3 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 20);
                    vw vwVar2 = new vw(2, (ib5) this.Y, ib5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 19);
                    f fVar4 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 21);
                    hb5Var.A(fb5Var2);
                    lk3 lk3Var = (lk3) hb5Var.a;
                    hb5Var.F0 = fVar3;
                    hb5Var.G0 = fVar4;
                    if (fb5Var2.Z) {
                        tu0.K(lk3Var, 300L, new gb5(hb5Var, fb5Var2, 0));
                        lk3Var.N();
                    } else {
                        tu0.K(lk3Var, 300L, new gb5(hb5Var, fb5Var2, 1));
                        CharSequence charSequence = fb5Var2.Y;
                        if (charSequence == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        lk3Var.P(charSequence, new yf3(fVar4, 7, fb5Var2));
                    }
                    lk3Var.setOnLongClickListener(new z52(vwVar2, fb5Var2, hb5Var, 7));
                    return;
                }
                return;
            case 6:
                K((sd6) hqdVar, i);
                return;
            case 7:
                L((a57) hqdVar, i);
                return;
            case 8:
                M((ln8) hqdVar, i);
                return;
            case 9:
                N((kgb) hqdVar, i);
                return;
            case 10:
                N((kgb) hqdVar, i);
                return;
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                super.r(hqdVar, i);
                return;
            case 13:
                O((hse) hqdVar, i);
                return;
        }
    }

    public void J(zn3 zn3Var, int i) {
        nn3 nn3Var = (nn3) ((ol7) C(i));
        jy2 jy2Var = new jy2(4, this);
        en3 en3Var = new en3(nn3Var, 0, this);
        ga gaVar = new ga(nn3Var, 8, this);
        bk bkVar = new bk(6, this);
        zn3Var.A(nn3Var);
        tb tbVar = new tb(gaVar, 19, nn3Var);
        View view = zn3Var.a;
        tu0.K(view, 300L, tbVar);
        lk3 lk3Var = (lk3) view;
        lk3Var.setOnLongClickListener(new ad2(en3Var, 1, nn3Var));
        if (!nn3Var.y0 || nn3Var.v0) {
            CharSequence charSequence = nn3Var.Y;
            if (charSequence != null) {
                lk3Var.P(charSequence, new yf3(jy2Var, 1, nn3Var));
            } else {
                lk3Var.N();
            }
        } else {
            lk3Var.setCallButtons(new ga(bkVar, 10, nn3Var));
        }
        lk3 lk3Var2 = (lk3) view;
        Boolean bool = nn3Var.x0;
        lk3Var2.setSelectionEnabled(bool != null);
        lk3Var2.setContactSelected(bool != null ? bool.booleanValue() : false);
    }

    public void K(sd6 sd6Var, int i) {
        rd6 rd6Var = (rd6) ((ol7) C(i));
        f fVar = new f(1, (qd6) this.Y, qd6.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0, 24);
        vw vwVar = new vw(2, (qd6) this.Y, qd6.class, "onGlobalContactCallClick", "onGlobalContactCallClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;Z)V", 0, 20);
        sd6Var.A(rd6Var);
        lk3 lk3Var = (lk3) sd6Var.a;
        tu0.K(lk3Var, 300L, new vu5(fVar, 4, rd6Var));
        if (rd6Var.s0) {
            lk3Var.setCallButtons(new ga(vwVar, 14, rd6Var));
        } else {
            lk3Var.N();
        }
    }

    public void L(a57 a57Var, int i) {
        y47 y47Var = (y47) ((ol7) C(i));
        f fVar = new f(1, (b57) this.Y, b57.class, "onInviteActionClick", "onInviteActionClick(Lone/me/inviteactions/list/InviteActionListItem$Type;)V", 0, 26);
        a57Var.A(y47Var);
        tu0.K(a57Var.a, 300L, new vu5(fVar, 7, y47Var));
    }

    public void M(ln8 ln8Var, int i) {
        vw vwVar;
        kn8 kn8Var = (kn8) ((ol7) C(i));
        if (kn8Var.s0 || kn8Var.t0) {
            vwVar = null;
        } else {
            vwVar = new vw(2, (fo8) this.Y, fo8.class, "onMemberLongClick", "onMemberLongClick(JLandroid/view/View;)V", 0, 25);
        }
        ga gaVar = new ga(kn8Var, 17, this);
        ln8Var.A(kn8Var);
        lk3 lk3Var = (lk3) ln8Var.a;
        tu0.K(lk3Var, 300L, new vu5(gaVar, 15, kn8Var));
        if (vwVar != null) {
            lk3Var.setOnLongClickListener(new ad2(vwVar, 3, kn8Var));
        } else {
            lk3Var.setOnLongClickListener(null);
            lk3Var.setLongClickable(false);
        }
        lk3Var.N();
    }

    public void N(kgb kgbVar, int i) {
        switch (this.X) {
            case 9:
                efb efbVar = (efb) ((ol7) C(i));
                kgbVar.A(efbVar);
                if (!(efbVar instanceof c4d)) {
                    if (!(efbVar instanceof qmd)) {
                        if (efbVar instanceof x6) {
                            n6 n6Var = kgbVar instanceof n6 ? (n6) kgbVar : null;
                            if (n6Var != null) {
                                tu0.K(n6Var.a, 300L, new m6(0, new zja(this, 2, efbVar)));
                                break;
                            }
                        }
                    } else {
                        tmd tmdVar = kgbVar instanceof tmd ? (tmd) kgbVar : null;
                        if (tmdVar != null) {
                            final int i2 = 1;
                            tmdVar.H0.addTextChangedListener(new vf1(tmdVar, 9, new m56(this) { // from class: hcb
                                public final /* synthetic */ a3g b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.m56
                                public final Object invoke(Object obj) {
                                    switch (i2) {
                                        case 0:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.l(((Integer) obj).intValue());
                                            break;
                                        default:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.k((String) obj);
                                            break;
                                    }
                                    return e5f.a;
                                }
                            }));
                            final int i3 = 0;
                            tu0.K(tmdVar.L0, 300L, new m6(24, new k56(this) { // from class: icb
                                public final /* synthetic */ a3g b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.k56
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.a();
                                            break;
                                        case 1:
                                            l22 l22VarP0 = ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0();
                                            j47.T(l22VarP0.a, null, null, new j22(l22VarP0, null), 3);
                                            break;
                                        default:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.e();
                                            break;
                                    }
                                    return e5f.a;
                                }
                            }));
                            final int i4 = 1;
                            tu0.K(tmdVar.I0, 300L, new m6(25, new k56(this) { // from class: icb
                                public final /* synthetic */ a3g b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.k56
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.a();
                                            break;
                                        case 1:
                                            l22 l22VarP0 = ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0();
                                            j47.T(l22VarP0.a, null, null, new j22(l22VarP0, null), 3);
                                            break;
                                        default:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.e();
                                            break;
                                    }
                                    return e5f.a;
                                }
                            }));
                            final int i5 = 2;
                            tu0.K(tmdVar.J0, 300L, new v7d(tmdVar, 5, new k56(this) { // from class: icb
                                public final /* synthetic */ a3g b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.k56
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.a();
                                            break;
                                        case 1:
                                            l22 l22VarP0 = ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0();
                                            j47.T(l22VarP0.a, null, null, new j22(l22VarP0, null), 3);
                                            break;
                                        default:
                                            ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.e();
                                            break;
                                    }
                                    return e5f.a;
                                }
                            }));
                            break;
                        }
                    }
                } else {
                    d4d d4dVar = kgbVar instanceof d4d ? (d4d) kgbVar : null;
                    if (d4dVar != null) {
                        final int i6 = 0;
                        tu0.K(d4dVar.a, 300L, new vu5(d4dVar, 29, new m56(this) { // from class: hcb
                            public final /* synthetic */ a3g b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.m56
                            public final Object invoke(Object obj) {
                                switch (i6) {
                                    case 0:
                                        ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.l(((Integer) obj).intValue());
                                        break;
                                    default:
                                        ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.k((String) obj);
                                        break;
                                }
                                return e5f.a;
                            }
                        }));
                        break;
                    }
                }
                break;
            default:
                efb efbVar2 = (efb) ((ol7) C(i));
                kgbVar.A(efbVar2);
                if (!(efbVar2 instanceof ql5)) {
                    if (!(efbVar2 instanceof zd7)) {
                        if (!(efbVar2 instanceof ol2)) {
                            if (!(efbVar2 instanceof vh4)) {
                                if (!(efbVar2 instanceof hz6)) {
                                    if (!(efbVar2 instanceof gh4)) {
                                        if (!(efbVar2 instanceof fy1)) {
                                            if (!(efbVar2 instanceof x6)) {
                                                if (efbVar2 instanceof pu7) {
                                                    ru7 ru7Var = kgbVar instanceof ru7 ? (ru7) kgbVar : null;
                                                    if (ru7Var != null) {
                                                        final int i7 = 3;
                                                        tu0.K(ru7Var.a, 300L, new m6(14, new k56(this) { // from class: hgb
                                                            public final /* synthetic */ a3g b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // defpackage.k56
                                                            public final Object invoke() {
                                                                switch (i7) {
                                                                    case 0:
                                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(64);
                                                                        break;
                                                                    case 1:
                                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(128);
                                                                        break;
                                                                    case 2:
                                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(256);
                                                                        break;
                                                                    default:
                                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(512);
                                                                        break;
                                                                }
                                                                return e5f.a;
                                                            }
                                                        }));
                                                        break;
                                                    }
                                                }
                                            } else {
                                                n6 n6Var2 = kgbVar instanceof n6 ? (n6) kgbVar : null;
                                                if (n6Var2 != null) {
                                                    tu0.K(n6Var2.a, 300L, new m6(0, new zja(this, 6, efbVar2)));
                                                    break;
                                                }
                                            }
                                        } else {
                                            gy1 gy1Var = kgbVar instanceof gy1 ? (gy1) kgbVar : null;
                                            if (gy1Var != null) {
                                                final int i8 = 2;
                                                tu0.K(gy1Var.F0, 300L, new m6(2, new k56(this) { // from class: hgb
                                                    public final /* synthetic */ a3g b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // defpackage.k56
                                                    public final Object invoke() {
                                                        switch (i8) {
                                                            case 0:
                                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(64);
                                                                break;
                                                            case 1:
                                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(128);
                                                                break;
                                                            case 2:
                                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(256);
                                                                break;
                                                            default:
                                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(512);
                                                                break;
                                                        }
                                                        return e5f.a;
                                                    }
                                                }));
                                                break;
                                            }
                                        }
                                    } else {
                                        fh4 fh4Var = kgbVar instanceof fh4 ? (fh4) kgbVar : null;
                                        if (fh4Var != null) {
                                            final int i9 = 1;
                                            tu0.K(fh4Var.a, 300L, new m6(8, new k56(this) { // from class: hgb
                                                public final /* synthetic */ a3g b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // defpackage.k56
                                                public final Object invoke() {
                                                    switch (i9) {
                                                        case 0:
                                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(64);
                                                            break;
                                                        case 1:
                                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(128);
                                                            break;
                                                        case 2:
                                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(256);
                                                            break;
                                                        default:
                                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(512);
                                                            break;
                                                    }
                                                    return e5f.a;
                                                }
                                            }));
                                            break;
                                        }
                                    }
                                } else {
                                    iz6 iz6Var = kgbVar instanceof iz6 ? (iz6) kgbVar : null;
                                    if (iz6Var != null) {
                                        final int i10 = 0;
                                        tu0.K(iz6Var.a, 300L, new m6(12, new k56(this) { // from class: hgb
                                            public final /* synthetic */ a3g b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // defpackage.k56
                                            public final Object invoke() {
                                                switch (i10) {
                                                    case 0:
                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(64);
                                                        break;
                                                    case 1:
                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(128);
                                                        break;
                                                    case 2:
                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(256);
                                                        break;
                                                    default:
                                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(512);
                                                        break;
                                                }
                                                return e5f.a;
                                            }
                                        }));
                                        break;
                                    }
                                }
                            } else {
                                yh4 yh4Var = kgbVar instanceof yh4 ? (yh4) kgbVar : null;
                                if (yh4Var != null) {
                                    final int i11 = 3;
                                    m56 m56Var = new m56(this) { // from class: ggb
                                        public final /* synthetic */ a3g b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // defpackage.m56
                                        public final Object invoke(Object obj) {
                                            String str = (String) obj;
                                            switch (i11) {
                                                case 0:
                                                    ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(1, str);
                                                    break;
                                                case 1:
                                                    ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(2, str);
                                                    break;
                                                case 2:
                                                    ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(131072, str);
                                                    break;
                                                default:
                                                    ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(4, str);
                                                    break;
                                            }
                                            return e5f.a;
                                        }
                                    };
                                    xh4 xh4Var = (xh4) yh4Var.a;
                                    xh4Var.t0.addTextChangedListener(new vf1(new a42(1, m56Var), 2, xh4Var));
                                    break;
                                }
                            }
                        } else {
                            pl2 pl2Var = kgbVar instanceof pl2 ? (pl2) kgbVar : null;
                            if (pl2Var != null) {
                                final int i12 = 2;
                                pl2Var.F0.b(new ga(new m56(this) { // from class: ggb
                                    public final /* synthetic */ a3g b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.m56
                                    public final Object invoke(Object obj) {
                                        String str = (String) obj;
                                        switch (i12) {
                                            case 0:
                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(1, str);
                                                break;
                                            case 1:
                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(2, str);
                                                break;
                                            case 2:
                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(131072, str);
                                                break;
                                            default:
                                                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(4, str);
                                                break;
                                        }
                                        return e5f.a;
                                    }
                                }, 3, pl2Var));
                                break;
                            }
                        }
                    } else {
                        ae7 ae7Var = kgbVar instanceof ae7 ? (ae7) kgbVar : null;
                        if (ae7Var != null) {
                            final int i13 = 1;
                            ae7Var.F0.addTextChangedListener(new vf1(new m56(this) { // from class: ggb
                                public final /* synthetic */ a3g b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.m56
                                public final Object invoke(Object obj) {
                                    String str = (String) obj;
                                    switch (i13) {
                                        case 0:
                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(1, str);
                                            break;
                                        case 1:
                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(2, str);
                                            break;
                                        case 2:
                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(131072, str);
                                            break;
                                        default:
                                            ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(4, str);
                                            break;
                                    }
                                    return e5f.a;
                                }
                            }, 6, ae7Var));
                            break;
                        }
                    }
                } else {
                    rl5 rl5Var = kgbVar instanceof rl5 ? (rl5) kgbVar : null;
                    if (rl5Var != null) {
                        final int i14 = 0;
                        rl5Var.F0.addTextChangedListener(new vf1(new m56(this) { // from class: ggb
                            public final /* synthetic */ a3g b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.m56
                            public final Object invoke(Object obj) {
                                String str = (String) obj;
                                switch (i14) {
                                    case 0:
                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(1, str);
                                        break;
                                    case 1:
                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(2, str);
                                        break;
                                    case 2:
                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(131072, str);
                                        break;
                                    default:
                                        ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(4, str);
                                        break;
                                }
                                return e5f.a;
                            }
                        }, 3, rl5Var));
                        break;
                    }
                }
                break;
        }
    }

    public void O(hse hseVar, int i) {
        vre vreVar = (vre) this.o.f.get(i);
        om8 om8Var = new om8(1, (cse) this.Y, cse.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 20);
        View view = hseVar.a;
        yre yreVar = (yre) view;
        yreVar.G0.setText(vreVar.a);
        Boolean bool = vreVar.b;
        yreVar.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((yre) view, 300L, new v7d(om8Var, 13, vreVar));
    }

    @Override // defpackage.ppd, defpackage.hdc
    public int l(int i) {
        switch (this.X) {
            case 4:
                return zia.n;
            case 5:
                return ((fb5) ((ol7) C(i))).getI0();
            case 6:
                return ((rd6) ((ol7) C(i))).t0;
            case 7:
                return ((y47) ((ol7) C(i))).o;
            case 8:
                return 1;
            case 9:
                return ((efb) ((ol7) C(i))).getI0();
            case 10:
                return ((efb) ((ol7) C(i))).getI0();
            case 11:
                return r9c.b;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((ol7) C(i)).getI0();
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public void r(dec decVar, int i) {
        switch (this.X) {
            case 0:
                r((hqd) decVar, i);
                break;
            case 1:
                ub ubVar = (ub) decVar;
                ba baVar = (ba) ((ol7) C(i));
                l lVar = new l(6, this);
                ubVar.A(baVar);
                ((lk3) ubVar.a).setOnClickListener(new tb(lVar, 0, baVar));
                break;
            case 2:
                ((mh0) decVar).A((ch0) ((ol7) C(i)));
                break;
            case 3:
                J((zn3) decVar, i);
                break;
            case 4:
                vy3 vy3Var = (vy3) decVar;
                uy3 uy3Var = (uy3) ((ol7) C(i));
                jy2 jy2Var = new jy2(8, this);
                vy3Var.A(uy3Var);
                ((LinearLayout) vy3Var.a).setOnClickListener(new tb(jy2Var, 27, uy3Var));
                break;
            case 5:
                r((hqd) decVar, i);
                break;
            case 6:
                K((sd6) decVar, i);
                break;
            case 7:
                L((a57) decVar, i);
                break;
            case 8:
                M((ln8) decVar, i);
                break;
            case 9:
                N((kgb) decVar, i);
                break;
            case 10:
                N((kgb) decVar, i);
                break;
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                super.r(decVar, i);
                break;
            case 13:
                O((hse) decVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 3:
                zn3 zn3Var = (zn3) decVar;
                Object objQ0 = x53.q0(list);
                if (objQ0 != null) {
                    if (objQ0 instanceof mn3) {
                        lk3 lk3Var = (lk3) zn3Var.a;
                        Boolean bool = ((mn3) objQ0).a;
                        lk3Var.setSelectionEnabled(bool != null);
                        lk3Var.setContactSelected(bool != null ? bool.booleanValue() : false);
                        break;
                    }
                } else {
                    J(zn3Var, i);
                    break;
                }
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            default:
                super.s(decVar, i, list);
                break;
            case 5:
                hqd hqdVar = (hqd) decVar;
                if (!list.isEmpty()) {
                    eb5 eb5Var = new eb5(7);
                    for (Object obj : list) {
                        u2 u2Var = obj instanceof eb5 ? (eb5) obj : null;
                        if (u2Var != null) {
                            eb5Var.M1(u2Var);
                        }
                    }
                    hqdVar.B((ol7) this.o.f.get(i), eb5Var);
                    break;
                } else {
                    r(hqdVar, i);
                    break;
                }
            case 9:
                kgb kgbVar = (kgb) decVar;
                if (list.isEmpty()) {
                    N(kgbVar, i);
                }
                for (Object obj2 : list) {
                    if ((obj2 instanceof xfb) && (((xfb) obj2) instanceof wfb)) {
                        tmd tmdVar = kgbVar instanceof tmd ? (tmd) kgbVar : null;
                        if (tmdVar != null) {
                            tmdVar.E(((wfb) obj2).a);
                        }
                    }
                }
                break;
            case 10:
                kgb kgbVar2 = (kgb) decVar;
                if (list.isEmpty()) {
                    N(kgbVar2, i);
                }
                for (Object obj3 : list) {
                    if (obj3 instanceof xfb) {
                        xfb xfbVar = (xfb) obj3;
                        if (xfbVar instanceof ufb) {
                            rl5 rl5Var = kgbVar2 instanceof rl5 ? (rl5) kgbVar2 : null;
                            if (rl5Var != null) {
                                rl5Var.E(((ufb) obj3).a);
                            }
                        } else if (xfbVar instanceof vfb) {
                            ae7 ae7Var = kgbVar2 instanceof ae7 ? (ae7) kgbVar2 : null;
                            if (ae7Var != null) {
                                ae7Var.E(((vfb) obj3).a);
                            }
                        } else if (xfbVar instanceof tfb) {
                            pl2 pl2Var = kgbVar2 instanceof pl2 ? (pl2) kgbVar2 : null;
                            if (pl2Var != null) {
                                pl2Var.E(((tfb) obj3).a);
                            }
                        }
                    }
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hqd hqdVar2 = (hqd) decVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof y2e) {
                            hqdVar2.B((ol7) this.o.f.get(i), x53.g0(list));
                            break;
                        }
                    }
                }
                r(hqdVar2, i);
                break;
            case 13:
                hse hseVar = (hse) decVar;
                Object objQ02 = x53.q0(list);
                if (objQ02 != null) {
                    if (objQ02 instanceof tre) {
                        yre yreVar = (yre) hseVar.a;
                        Boolean bool2 = ((tre) objQ02).a;
                        yreVar.setSelected(bool2 != null ? bool2.booleanValue() : false);
                        break;
                    }
                } else {
                    O(hseVar, i);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                Continuation continuation = null;
                if (i != kla.e) {
                    if (i == kla.h) {
                        return new z2g(new ufd(viewGroup.getContext(), null));
                    }
                    if (i == kla.g) {
                        return new y2g(new ufd(viewGroup.getContext(), null));
                    }
                    String name = a3g.class.getName();
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
                    }
                    return new az0(new View(viewGroup.getContext()), 22);
                }
                Context context = viewGroup.getContext();
                ViewGroup.LayoutParams pdcVar = new pdc(-1, -2);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(pdcVar);
                linearLayout.setOrientation(1);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(new ShapeDrawable(new OvalShape()));
                float f = 54;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                float f2 = 20;
                layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                layoutParams.bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                layoutParams.gravity = 1;
                imageView.setLayoutParams(layoutParams);
                rh4.p(15, fk4.d().getDisplayMetrics().density, imageView);
                imageView.setImageResource(woc.U1);
                int i2 = 3;
                v3c.y(new ze2(i2, continuation, 10), imageView);
                linearLayout.addView(imageView);
                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                TextView textView = new TextView(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.leftMargin = iG;
                layoutParams2.rightMargin = iG;
                layoutParams2.bottomMargin = iG;
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setGravity(17);
                textView.setText(mla.k);
                i4f.j.b(textView, du4.b);
                v3c.y(new v9(i2, continuation, 28), textView);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.leftMargin = iG;
                layoutParams3.rightMargin = iG;
                layoutParams3.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                layoutParams3.gravity = 1;
                textView2.setLayoutParams(layoutParams3);
                textView2.setGravity(17);
                textView2.setText(mla.j);
                i4f.f.b(textView2, du4.b);
                v3c.y(new v9(i2, continuation, 29), textView2);
                linearLayout.addView(textView2);
                return new az0(linearLayout, 21);
            case 1:
                return new ub(new lk3(viewGroup.getContext(), null));
            case 2:
                return new mh0(viewGroup.getContext(), (wq3) this.Y);
            case 3:
                return new zn3(new lk3(viewGroup.getContext(), null));
            case 4:
                return new vy3(viewGroup);
            case 5:
                if (i == p8a.u) {
                    return new db5(new m62(viewGroup.getContext()));
                }
                if (i == p8a.v) {
                    return new hb5(new lk3(viewGroup.getContext(), null));
                }
                throw new IllegalArgumentException(wg0.g(i, "Unknown viewType '", "'"));
            case 6:
                return new sd6(new lk3(viewGroup.getContext(), null));
            case 7:
                return new a57(new z47(viewGroup.getContext()));
            case 8:
                return new ln8(new lk3(viewGroup.getContext(), null));
            case 9:
                int i3 = 536870911 & i;
                if (dy7.o(i3, 8192)) {
                    return new d4d(viewGroup.getContext());
                }
                if (dy7.o(i3, 8)) {
                    return new g2b(viewGroup.getContext(), 2);
                }
                if (dy7.o(i3, 16)) {
                    return new tmd(viewGroup.getContext());
                }
                if (dy7.o(i3, 2048)) {
                    return new g2b(viewGroup.getContext(), 1);
                }
                if (!dy7.o(i3, 65536)) {
                    if (dy7.o(i3, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                        return new n6(viewGroup.getContext());
                    }
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
                TextView textView3 = new TextView(viewGroup.getContext());
                g2b g2bVar = new g2b(textView3);
                textView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView3.setGravity(17);
                float f3 = 12;
                float f4 = 28;
                textView3.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                i4f.n.b(textView3, du4.b);
                return g2bVar;
            case 10:
                int i4 = 536870911 & i;
                if (dy7.o(i4, 1)) {
                    return new rl5(viewGroup.getContext());
                }
                if (dy7.o(i4, 2)) {
                    return new ae7(viewGroup.getContext());
                }
                if (dy7.o(i4, 131072)) {
                    return new pl2(viewGroup.getContext());
                }
                if (dy7.o(i4, 4)) {
                    xh4 xh4Var = new xh4(viewGroup.getContext());
                    yh4 yh4Var = new yh4(xh4Var);
                    xh4Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return yh4Var;
                }
                if (dy7.o(i4, 64)) {
                    return new iz6(viewGroup.getContext());
                }
                if (dy7.o(i4, 128)) {
                    return new fh4(viewGroup.getContext());
                }
                if (dy7.o(i4, 256)) {
                    return new gy1(viewGroup.getContext());
                }
                if (!dy7.o(i4, 512)) {
                    if (dy7.o(i4, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                        return new n6(viewGroup.getContext());
                    }
                    if (dy7.o(i4, 2048)) {
                        return new g2b(viewGroup.getContext(), 1);
                    }
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
                OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
                ru7 ru7Var = new ru7(oneMeButton);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.c);
                oneMeButton.setText(vea.v0);
                return ru7Var;
            case 11:
                return new az0(new s9c(new e09(0, (jv2) this.Y, jv2.class, "onClearClick", "onClearClick()V", 0, 6), viewGroup.getContext()), 11);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return rxd.V((rxd) this.Y, viewGroup.getContext(), i);
            default:
                return new hse(new yre(viewGroup.getContext()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3g(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3g(ExecutorService executorService, w2e w2eVar) {
        super(executorService);
        this.X = 12;
        this.Y = new rxd(29, w2eVar);
    }
}
