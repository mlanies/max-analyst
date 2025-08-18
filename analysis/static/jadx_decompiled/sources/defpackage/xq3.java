package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class xq3 extends hl7 {
    public final /* synthetic */ int X = 2;
    public final Object Y;

    public xq3(wq3 wq3Var) {
        super(new y34(5));
        this.Y = wq3Var;
        A(true);
    }

    @Override // defpackage.hdc
    public long k(int i) {
        switch (this.X) {
            case 0:
                return au1.s(((yq3) C(i)).a);
            default:
                return super.k(i);
        }
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        switch (this.X) {
            case 0:
                int iS = au1.s(((yq3) C(i)).a);
                if (iS != 0) {
                    return (iS == 2 || iS == 3) ? 2 : 1;
                }
                return 0;
            case 1:
                return p8a.t;
            default:
                return ((izc) C(i)).getI0();
        }
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        CharSequence charSequenceD;
        e52 e52Var;
        uj3 uj3VarL;
        String string;
        String string2;
        int i2 = 5;
        final int i3 = 3;
        boolean z = true;
        z = true;
        final int i4 = 0;
        final int i5 = 2;
        switch (this.X) {
            case 0:
                final yq3 yq3Var = (yq3) C(i);
                if (!(decVar instanceof ar3)) {
                    if (!(decVar instanceof sr3)) {
                        if (decVar instanceof gr3) {
                            final gr3 gr3Var = (gr3) decVar;
                            final boolean z2 = j() > 1;
                            x8a x8aVar = (x8a) gr3Var.a;
                            int iS = au1.s(yq3Var.a);
                            if (iS != 1) {
                                int[] iArr = gr3.I0;
                                if (iS == 4) {
                                    x8aVar.setTitle(z7.B(x8aVar.getContext(), u5a.c));
                                    x8aVar.setSubtitle(z7.B(x8aVar.getContext(), u5a.i));
                                    float f = 24;
                                    x8aVar.x(kt3.b(x8aVar.getContext(), woc.w1), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                                    x8aVar.R0.setColors(iArr, new float[]{0.0f, 1.0f});
                                } else if (iS == 6) {
                                    x8aVar.setTitle(z7.B(x8aVar.getContext(), u5a.b));
                                    x8aVar.setSubtitle(z7.B(x8aVar.getContext(), u5a.a));
                                    float f2 = 24;
                                    x8aVar.x(kt3.b(x8aVar.getContext(), woc.X0), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                                    x8aVar.R0.setColors(iArr, new float[]{0.0f, 1.0f});
                                }
                            } else {
                                x8aVar.setTitle(z7.B(x8aVar.getContext(), u5a.e));
                                x8aVar.setSubtitle(z7.B(x8aVar.getContext(), u5a.d));
                                float f3 = 24;
                                x8aVar.x(kt3.b(x8aVar.getContext(), woc.b), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                                x8aVar.R0.setColors(gr3.H0, new float[]{0.0f, 1.0f});
                            }
                            x8aVar.setCloseButtonVisibility(false);
                            x8aVar.setBannerClickListener(new View.OnClickListener() { // from class: fr3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i4) {
                                        case 0:
                                            gr3 gr3Var2 = (gr3) gr3Var;
                                            wq3 wq3Var = gr3Var2.F0;
                                            int i6 = yq3Var.a;
                                            wq3Var.w(i6);
                                            gr3Var2.G0.a(f46.c0(i6), 1, z2 ? 1 : 2);
                                            break;
                                        default:
                                            sr3 sr3Var = (sr3) gr3Var;
                                            wq3 wq3Var2 = sr3Var.F0;
                                            int i7 = yq3Var.a;
                                            wq3Var2.w(i7);
                                            sr3Var.G0.a(f46.c0(i7), 2, z2 ? 1 : 2);
                                            break;
                                    }
                                }
                            });
                            x8aVar.setCloseButtonClickListener(new tb(gr3Var, 21, yq3Var));
                            break;
                        }
                    } else {
                        final sr3 sr3Var = (sr3) decVar;
                        final boolean z3 = j() > 1;
                        zda zdaVar = (zda) sr3Var.a;
                        int iS2 = au1.s(yq3Var.a);
                        if (iS2 == 2) {
                            zdaVar.setTitle(z7.B(zdaVar.getContext(), u5a.h));
                            zdaVar.setSubtitle(z7.B(zdaVar.getContext(), u5a.g));
                            float f4 = 56;
                            zdaVar.x(kt3.b(zdaVar.getContext(), woc.b), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                            zdaVar.R0.setColors(sr3.H0, new float[]{0.0f, 1.0f});
                        } else if (iS2 == 3) {
                            zdaVar.setTitle(z7.B(zdaVar.getContext(), u5a.f));
                            zdaVar.setSubtitle(z7.B(zdaVar.getContext(), u5a.i));
                            float f5 = 56;
                            zdaVar.x(kt3.b(zdaVar.getContext(), woc.w1), tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                            zdaVar.R0.setColors(sr3.I0, new float[]{0.0f, 1.0f});
                        }
                        zdaVar.setCloseButtonVisibility(false);
                        final int i6 = z ? 1 : 0;
                        zdaVar.setBannerClickListener(new View.OnClickListener() { // from class: fr3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        gr3 gr3Var2 = (gr3) sr3Var;
                                        wq3 wq3Var = gr3Var2.F0;
                                        int i62 = yq3Var.a;
                                        wq3Var.w(i62);
                                        gr3Var2.G0.a(f46.c0(i62), 1, z3 ? 1 : 2);
                                        break;
                                    default:
                                        sr3 sr3Var2 = (sr3) sr3Var;
                                        wq3 wq3Var2 = sr3Var2.F0;
                                        int i7 = yq3Var.a;
                                        wq3Var2.w(i7);
                                        sr3Var2.G0.a(f46.c0(i7), 2, z3 ? 1 : 2);
                                        break;
                                }
                            }
                        });
                        zdaVar.setCloseButtonClickListener(new tb(sr3Var, 22, yq3Var));
                        break;
                    }
                }
                break;
            case 1:
                ((z8c) ((a9c) decVar).a).setContacts((List) C(i));
                break;
            default:
                izc izcVar = (izc) C(i);
                if (!(izcVar instanceof vq2)) {
                    if (!(izcVar instanceof od6)) {
                        if (!(izcVar instanceof jq3)) {
                            if (!(izcVar instanceof td6)) {
                                if (izcVar instanceof mx8) {
                                    mx8 mx8Var = (mx8) izcVar;
                                    m56 m56Var = new m56(this) { // from class: ryc
                                        public final /* synthetic */ xq3 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // defpackage.m56
                                        public final Object invoke(Object obj) {
                                            izc izcVar2 = (izc) obj;
                                            switch (i3) {
                                                case 0:
                                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                    break;
                                                case 1:
                                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                    break;
                                                case 2:
                                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                    break;
                                                default:
                                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                    break;
                                            }
                                            return e5f.a;
                                        }
                                    };
                                    m62 m62Var = (m62) ((ox8) decVar).a;
                                    tu0.K(m62Var, 300L, new vu5(m56Var, 17, mx8Var));
                                    if (mx8Var.Y != null) {
                                        m62Var.setTitle(mx8Var.t0);
                                        Uri uri = mx8Var.c;
                                        e52 e52Var2 = mx8Var.Y;
                                        e52Var2.l0();
                                        m62Var.c(uri, e52Var2.x0, Long.valueOf(mx8Var.Y.f()));
                                    }
                                    if (m62Var.a(mx8Var.s0.a.toString())) {
                                        w6b w6bVar = mx8Var.s0;
                                        charSequenceD = ema.D(w6bVar.a, mx8Var.b, w6bVar.b);
                                    } else {
                                        charSequenceD = mx8Var.s0.a;
                                    }
                                    m62Var.setSubtitle(charSequenceD);
                                    ida idaVarO = jyc.a.o();
                                    long j = mx8Var.X.b;
                                    t33 t33Var = idaVarO.c;
                                    m62Var.setTime(ay7.j(idaVarO.a, t33Var.v(), j, t33Var.n(), true));
                                    e52 e52Var3 = mx8Var.Y;
                                    if ((e52Var3 == null || !e52Var3.X()) && ((e52Var = mx8Var.Y) == null || (uj3VarL = e52Var.l()) == null || !uj3VarL.u())) {
                                        z = false;
                                    }
                                    m62Var.setVerified(z);
                                    break;
                                }
                            } else {
                                td6 td6Var = (td6) izcVar;
                                m56 m56Var2 = new m56(this) { // from class: ryc
                                    public final /* synthetic */ xq3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.m56
                                    public final Object invoke(Object obj) {
                                        izc izcVar2 = (izc) obj;
                                        switch (i5) {
                                            case 0:
                                                ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                break;
                                            case 1:
                                                ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                break;
                                            case 2:
                                                ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                break;
                                            default:
                                                ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                                break;
                                        }
                                        return e5f.a;
                                    }
                                };
                                lk3 lk3Var = (lk3) ((ud6) decVar).a;
                                tu0.K(lk3Var, 300L, new vu5(m56Var2, i2, td6Var));
                                w6b w6bVar2 = td6Var.X;
                                boolean zM = lk3Var.M(w6bVar2.a.toString());
                                List list = td6Var.b;
                                lk3Var.setName(zM ? ema.D(w6bVar2.a, list, w6bVar2.b) : w6bVar2.a);
                                w6b w6bVar3 = td6Var.Y;
                                lk3Var.setMessage(lk3Var.K(w6bVar3.a.toString()) ? ema.D(w6bVar3.a, list, w6bVar3.b) : w6bVar3.a);
                                Uri uri2 = td6Var.t0;
                                if (uri2 == null || (string = uri2.toString()) == null) {
                                    string = Uri.EMPTY.toString();
                                }
                                lk3Var.O(td6Var.c, td6Var.o, string);
                                lk3Var.setVerified(td6Var.s0);
                                break;
                            }
                        } else {
                            jq3 jq3Var = (jq3) izcVar;
                            final int i7 = z ? 1 : 0;
                            m56 m56Var3 = new m56(this) { // from class: ryc
                                public final /* synthetic */ xq3 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.m56
                                public final Object invoke(Object obj) {
                                    izc izcVar2 = (izc) obj;
                                    switch (i7) {
                                        case 0:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                            break;
                                        case 1:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                            break;
                                        case 2:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                            break;
                                        default:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                            break;
                                    }
                                    return e5f.a;
                                }
                            };
                            final int i8 = z ? 1 : 0;
                            a66 a66Var = new a66(this) { // from class: syc
                                public final /* synthetic */ xq3 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.a66
                                public final Object invoke(Object obj, Object obj2) {
                                    izc izcVar2 = (izc) obj;
                                    View view = (View) obj2;
                                    switch (i8) {
                                        case 0:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).p0(izcVar2, view);
                                            break;
                                        default:
                                            ((ChatsListSearchScreen) ((tyc) this.b.Y)).p0(izcVar2, view);
                                            break;
                                    }
                                    return e5f.a;
                                }
                            };
                            lk3 lk3Var2 = (lk3) ((lq3) decVar).a;
                            tu0.K(lk3Var2, 300L, new tb(m56Var3, 20, jq3Var));
                            lk3Var2.setOnLongClickListener(new z52(a66Var, jq3Var, lk3Var2, i2));
                            Uri uri3 = jq3Var.t0;
                            if (uri3 == null || (string2 = uri3.toString()) == null) {
                                string2 = Uri.EMPTY.toString();
                            }
                            lk3Var2.O(jq3Var.c, jq3Var.u0, string2);
                            lk3Var2.setName(jq3Var.o);
                            lk3Var2.setMessage(jq3Var.X);
                            lk3Var2.setVerified(jq3Var.Z);
                            break;
                        }
                    } else {
                        od6 od6Var = (od6) izcVar;
                        ga gaVar = new ga(this, 28, (od6) izcVar);
                        ai0 ai0Var = new ai0(25);
                        m62 m62Var2 = (m62) ((pd6) decVar).a;
                        tu0.K(m62Var2, 300L, new vu5(gaVar, i3, od6Var));
                        m62Var2.setOnLongClickListener(new z52(ai0Var, od6Var, m62Var2, 9));
                        long j2 = od6Var.c;
                        m62Var2.setId(Long.hashCode(j2));
                        w6b w6bVar4 = od6Var.Y;
                        boolean zB = m62Var2.b(w6bVar4.a.toString());
                        List list2 = od6Var.b;
                        m62Var2.setTitle(zB ? ema.D(w6bVar4.a, list2, w6bVar4.b) : w6bVar4.a);
                        w6b w6bVar5 = od6Var.Z;
                        CharSequence charSequenceD2 = w6bVar5.a;
                        if (m62Var2.a(charSequenceD2.toString())) {
                            charSequenceD2 = ema.D(charSequenceD2, list2, w6bVar5.b);
                        }
                        m62Var2.setSubtitle(charSequenceD2);
                        m62Var2.c(od6Var.X, od6Var.u0, Long.valueOf(j2));
                        m62Var2.setTime(od6Var.o);
                        m62Var2.setVerified(od6Var.v0);
                        break;
                    }
                } else {
                    vq2 vq2Var = (vq2) izcVar;
                    m56 m56Var4 = new m56(this) { // from class: ryc
                        public final /* synthetic */ xq3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            izc izcVar2 = (izc) obj;
                            switch (i4) {
                                case 0:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                    break;
                                case 1:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                    break;
                                case 2:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                    break;
                                default:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).o0(izcVar2);
                                    break;
                            }
                            return e5f.a;
                        }
                    };
                    a66 a66Var2 = new a66(this) { // from class: syc
                        public final /* synthetic */ xq3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.a66
                        public final Object invoke(Object obj, Object obj2) {
                            izc izcVar2 = (izc) obj;
                            View view = (View) obj2;
                            switch (i4) {
                                case 0:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).p0(izcVar2, view);
                                    break;
                                default:
                                    ((ChatsListSearchScreen) ((tyc) this.b.Y)).p0(izcVar2, view);
                                    break;
                            }
                            return e5f.a;
                        }
                    };
                    m62 m62Var3 = (m62) ((wq2) decVar).a;
                    tu0.K(m62Var3, 300L, new tb(m56Var4, 14, vq2Var));
                    m62Var3.setOnLongClickListener(new z52(a66Var2, vq2Var, m62Var3, i3));
                    int id = m62Var3.getId();
                    m62Var3.setId(Long.hashCode(vq2Var.c));
                    w6b w6bVar6 = vq2Var.x0;
                    m62Var3.setTitle(m62Var3.b(w6bVar6.a.toString()) ? ema.D(w6bVar6.a, vq2Var.b, w6bVar6.b) : w6bVar6.a);
                    m62Var3.setSubtitle(vq2Var.y0);
                    m62Var3.c(vq2Var.v0, vq2Var.E0, Long.valueOf(vq2Var.w0));
                    m62Var3.setPinned(vq2Var.o);
                    m62Var3.setMuted(vq2Var.X);
                    m62Var3.setMention(vq2Var.Y);
                    m62Var3.setReaction(vq2Var.Z);
                    m62Var3.setTime(vq2Var.s0);
                    m62Var3.e(vq2Var.t0, id == m62Var3.getId());
                    m62Var3.setStatus(vq2Var.u0);
                    m62Var3.setVerified(vq2Var.F0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hdc
    public void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 2:
                r(decVar, i);
                break;
            default:
                super.s(decVar, i, list);
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                wq3 wq3Var = (wq3) this.Y;
                return i != 0 ? (i == 2 || i == 3) ? new sr3(viewGroup.getContext(), wq3Var) : new gr3(viewGroup.getContext(), wq3Var) : new ar3(viewGroup.getContext(), wq3Var);
            case 1:
                return new a9c(new z8c(viewGroup.getContext(), (zu2) this.Y));
            default:
                if (i == p8a.l) {
                    return new wq2(new m62(viewGroup.getContext()));
                }
                if (i == p8a.o) {
                    return new pd6(new m62(viewGroup.getContext()));
                }
                if (i == p8a.m) {
                    return new lq3(new lk3(viewGroup.getContext(), null));
                }
                if (i == p8a.p) {
                    return new ud6(new lk3(viewGroup.getContext(), null));
                }
                if (i == p8a.r) {
                    return new ox8(new m62(viewGroup.getContext()));
                }
                throw new IllegalArgumentException(zr6.h(i, "Unsupported view type: "));
        }
    }

    public xq3(zu2 zu2Var, ExecutorService executorService) {
        super(new qz7(executorService, 4, new y34(7)));
        this.Y = zu2Var;
    }

    public xq3(tyc tycVar, ExecutorService executorService) {
        super(new qz7(executorService, 4, new y34(8)));
        this.Y = tycVar;
    }
}
