package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class af1 extends ppd {
    public final nnf X;
    public final Executor Y;
    public final ye1 Z;
    public final k56 s0;
    public final k56 t0;
    public final k56 u0;

    /* JADX WARN: Illegal instructions before constructor call */
    public af1(nnf nnfVar, ye1 ye1Var, k56 k56Var, hm1 hm1Var, i71 i71Var, int i) {
        ExecutorService executorServiceA = jyc.a.p().a();
        hm1Var = (i & 16) != 0 ? null : hm1Var;
        i71Var = (i & 32) != 0 ? null : i71Var;
        super(executorServiceA);
        this.X = nnfVar;
        this.Y = executorServiceA;
        this.Z = ye1Var;
        this.s0 = k56Var;
        this.t0 = hm1Var;
        this.u0 = i71Var;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void r(hqd hqdVar, int i) {
        s(hqdVar, i, nz4.a);
    }

    @Override // defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(hqd hqdVar, int i, List list) {
        k56 k56Var;
        if ((hqdVar instanceof xe1 ? (xe1) hqdVar : null) != null) {
            if (this.X != nnf.c) {
                ((xe1) hqdVar).G0.setMode(yo1.b);
            } else if (j() == 1 && (k56Var = this.u0) != null && ((Number) k56Var.invoke()).intValue() == 0) {
                ((xe1) hqdVar).G0.setMode(yo1.X);
            } else {
                ((xe1) hqdVar).G0.setMode(yo1.a);
            }
        }
        int iK = K();
        View view = hqdVar.a;
        if (view.getWidth() != iK || view.getHeight() != iK) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iK;
            layoutParams.height = iK;
            view.setLayoutParams(layoutParams);
        }
        iv ivVar = this.o;
        if (((kb1) ivVar.f.get(i)).getI0() != 1) {
            hqdVar.A((ol7) ivVar.f.get(i));
            return;
        }
        if (list.isEmpty()) {
            hqdVar.A((ol7) ivVar.f.get(i));
            return;
        }
        xe1 xe1Var = (xe1) hqdVar;
        pk5 pk5Var = new pk5(l6d.Z(new um5(new at(2, list), new we1(0), n6d.a), n71.o));
        while (pk5Var.hasNext()) {
            gb1 gb1Var = (gb1) pk5Var.next();
            boolean z = gb1Var instanceof cb1;
            ap1 ap1Var = xe1Var.G0;
            if (z) {
                cb1 cb1Var = (cb1) gb1Var;
                ap1Var.J(cb1Var.b, cb1Var.a);
            } else if (gb1Var instanceof db1) {
                ap1Var.setRaiseHand(((db1) gb1Var).a);
            } else if (gb1Var instanceof bb1) {
                ap1Var.F(((bb1) gb1Var).a);
            } else if (gb1Var instanceof eb1) {
                ap1Var.G(((eb1) gb1Var).a);
            } else if (gb1Var instanceof za1) {
                ap1Var.setAvatar(((za1) gb1Var).a);
            } else if (gb1Var instanceof ab1) {
                ap1Var.setButtonAction(((ab1) gb1Var).a);
            } else {
                if (!(gb1Var instanceof fb1)) {
                    throw new NoWhenBranchMatchedException();
                }
                ap1Var.setOpponentVideo(((fb1) gb1Var).a);
            }
        }
    }

    public final int K() {
        int iOrdinal = this.X.ordinal();
        if (iOrdinal == 0) {
            return tu0.G(96 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return tu0.G(0 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((kb1) this.o.f.get(i)).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int iK = K();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
        ye1 ye1Var = this.Z;
        if (i != 3) {
            if (i == 4) {
                View aq1Var = new aq1(viewGroup.getContext());
                aq1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(aq1Var);
                return new az0(frameLayout, 4);
            }
            ap1 ap1Var = new ap1(viewGroup.getContext(), null);
            ap1Var.setId(rvb.call_opponent);
            int iOrdinal = this.X.ordinal();
            yo1 yo1Var = yo1.b;
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yo1Var = yo1.a;
            }
            ap1Var.setMode(yo1Var);
            ap1Var.setCustomTheme(qp4.u0.p(ap1Var).c);
            ap1Var.setCallSpeakerMediator(this.t0);
            ap1Var.setVideoLayoutUpdatesControllerProvider(this.s0);
            frameLayout.addView(ap1Var, -1, -1);
            return new xe1(frameLayout, ye1Var);
        }
        Context context = viewGroup.getContext();
        final vl1 vl1Var = new vl1(context, null);
        pq9 pq9Var = qp4.u0;
        vl1Var.setBackgroundColor(pq9Var.p(vl1Var).c.b().g);
        dy7.H(vl1Var, fk4.d().getDisplayMetrics().density * 20.0f);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(y7a.Y);
        appCompatTextView.setLayoutParams(new ti3(-1, -2));
        appCompatTextView.setGravity(17);
        i4f.b.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9Var.p(appCompatTextView).c.getText().e);
        appCompatTextView.setText(f0c.call_item_join_by_link_preview_title);
        knc kncVar = new knc(context, null);
        kncVar.setId(y7a.U);
        int i2 = x7a.E;
        pq9Var.p(kncVar).c.getClass();
        kncVar.y(i2, -1);
        kncVar.setAccessibility(Integer.valueOf(b8a.F));
        kncVar.setMode(fnc.X);
        float f = 32;
        kncVar.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        kncVar.setButtonPadding(tu0.G(3 * fk4.d().getDisplayMetrics().density));
        final int i3 = 0;
        tu0.K(kncVar, 300L, new View.OnClickListener() { // from class: tl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ul1 ul1Var = vl1Var.G0;
                        if (ul1Var != null) {
                            ul1Var.h();
                            break;
                        }
                        break;
                    case 1:
                        ul1 ul1Var2 = vl1Var.G0;
                        if (ul1Var2 != null) {
                            ul1Var2.e();
                            break;
                        }
                        break;
                    case 2:
                        ul1 ul1Var3 = vl1Var.G0;
                        if (ul1Var3 != null) {
                            ul1Var3.d();
                            break;
                        }
                        break;
                    default:
                        ul1 ul1Var4 = vl1Var.G0;
                        if (ul1Var4 != null) {
                            ul1Var4.m();
                            break;
                        }
                        break;
                }
            }
        });
        knc kncVar2 = new knc(context, null);
        kncVar2.setId(y7a.V);
        fnc fncVar = fnc.a;
        kncVar2.setMode(fncVar);
        float f2 = 56;
        kncVar2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        float f3 = 6;
        kncVar2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        knc.B(kncVar2, x7a.H);
        int i4 = b8a.T;
        kncVar2.setTitle(new eqe(i4));
        kncVar2.setAccessibility(Integer.valueOf(i4));
        final int i5 = 1;
        tu0.K(kncVar2, 300L, new View.OnClickListener() { // from class: tl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        ul1 ul1Var = vl1Var.G0;
                        if (ul1Var != null) {
                            ul1Var.h();
                            break;
                        }
                        break;
                    case 1:
                        ul1 ul1Var2 = vl1Var.G0;
                        if (ul1Var2 != null) {
                            ul1Var2.e();
                            break;
                        }
                        break;
                    case 2:
                        ul1 ul1Var3 = vl1Var.G0;
                        if (ul1Var3 != null) {
                            ul1Var3.d();
                            break;
                        }
                        break;
                    default:
                        ul1 ul1Var4 = vl1Var.G0;
                        if (ul1Var4 != null) {
                            ul1Var4.m();
                            break;
                        }
                        break;
                }
            }
        });
        knc kncVar3 = new knc(context, null);
        kncVar3.setId(y7a.X);
        kncVar3.setMode(fncVar);
        kncVar3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        kncVar3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        knc.B(kncVar3, x7a.q0);
        int i6 = b8a.V;
        kncVar3.setTitle(new eqe(i6));
        kncVar3.setAccessibility(Integer.valueOf(i6));
        final int i7 = 2;
        tu0.K(kncVar3, 300L, new View.OnClickListener() { // from class: tl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ul1 ul1Var = vl1Var.G0;
                        if (ul1Var != null) {
                            ul1Var.h();
                            break;
                        }
                        break;
                    case 1:
                        ul1 ul1Var2 = vl1Var.G0;
                        if (ul1Var2 != null) {
                            ul1Var2.e();
                            break;
                        }
                        break;
                    case 2:
                        ul1 ul1Var3 = vl1Var.G0;
                        if (ul1Var3 != null) {
                            ul1Var3.d();
                            break;
                        }
                        break;
                    default:
                        ul1 ul1Var4 = vl1Var.G0;
                        if (ul1Var4 != null) {
                            ul1Var4.m();
                            break;
                        }
                        break;
                }
            }
        });
        knc kncVar4 = new knc(context, null);
        kncVar4.setId(y7a.W);
        kncVar4.setMode(fncVar);
        kncVar4.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        kncVar4.setButtonPadding(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        knc.B(kncVar4, x7a.o0);
        int i8 = b8a.U;
        kncVar4.setTitle(new eqe(i8));
        kncVar4.setAccessibility(Integer.valueOf(i8));
        final int i9 = 3;
        tu0.K(kncVar4, 300L, new View.OnClickListener() { // from class: tl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        ul1 ul1Var = vl1Var.G0;
                        if (ul1Var != null) {
                            ul1Var.h();
                            break;
                        }
                        break;
                    case 1:
                        ul1 ul1Var2 = vl1Var.G0;
                        if (ul1Var2 != null) {
                            ul1Var2.e();
                            break;
                        }
                        break;
                    case 2:
                        ul1 ul1Var3 = vl1Var.G0;
                        if (ul1Var3 != null) {
                            ul1Var3.d();
                            break;
                        }
                        break;
                    default:
                        ul1 ul1Var4 = vl1Var.G0;
                        if (ul1Var4 != null) {
                            ul1Var4.m();
                            break;
                        }
                        break;
                }
            }
        });
        vl1Var.addView(appCompatTextView);
        vl1Var.addView(kncVar);
        vl1Var.addView(kncVar2);
        vl1Var.addView(kncVar3);
        vl1Var.addView(kncVar4);
        dj3 dj3VarQ = fp3.q(vl1Var);
        int id = kncVar.getId();
        dj3VarQ.d(id, 3, 0, 3);
        float f4 = 12;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        new l2a(dj3VarQ, 7, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id2 = appCompatTextView.getId();
        dj3VarQ.d(id2, 3, kncVar.getId(), 4);
        dj3VarQ.d(id2, 7, 0, 7);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id3 = kncVar2.getId();
        dj3VarQ.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p(4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        dj3VarQ.d(id3, 7, kncVar4.getId(), 6);
        dj3VarQ.d(id3, 4, 0, 4);
        new l2a(dj3VarQ, 4, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id4 = kncVar4.getId();
        dj3VarQ.d(id4, 3, kncVar2.getId(), 3);
        dj3VarQ.d(id4, 6, kncVar2.getId(), 7);
        dj3VarQ.d(id4, 7, kncVar3.getId(), 6);
        dj3VarQ.d(id4, 4, kncVar2.getId(), 4);
        int id5 = kncVar3.getId();
        dj3VarQ.d(id5, 3, kncVar4.getId(), 3);
        dj3VarQ.d(id5, 6, kncVar4.getId(), 7);
        dj3VarQ.d(id5, 7, 0, 7);
        new l2a(dj3VarQ, 7, id5, 4).e(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id5, 4, kncVar4.getId(), 4);
        dj3VarQ.a(vl1Var);
        vl1Var.setId(rvb.call_copy_link_preview);
        vl1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(vl1Var);
        return new ze1(frameLayout, ye1Var);
    }
}
