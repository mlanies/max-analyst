package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j6e extends ppd {
    public final /* synthetic */ int X = 1;
    public final m56 Y;
    public final Object Z;
    public final f66 s0;

    public j6e(ExecutorService executorService, l6c l6cVar, wz7 wz7Var, lwa lwaVar) {
        super(executorService);
        this.Z = l6cVar;
        this.Y = wz7Var;
        this.s0 = lwaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ppd
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 0:
                super.r(hqdVar, i);
                if (hqdVar instanceof a1d) {
                    ((a1d) hqdVar).b((m6e) this.Y);
                }
                if (hqdVar instanceof s3e) {
                    s3e s3eVar = (s3e) hqdVar;
                    s3eVar.I0.setOnTouchListener(new rf1(s3eVar, (m6e) ((m56) this.s0)));
                    m56 m56Var = (m56) this.Z;
                    View view = s3eVar.a;
                    if (m56Var == null) {
                        view.setOnLongClickListener(null);
                        break;
                    } else {
                        view.setOnLongClickListener(new ad2(s3eVar, (m6e) m56Var));
                        break;
                    }
                }
                break;
            default:
                ol7 ol7Var = (ol7) C(i);
                j6c j6cVar = ol7Var instanceof j6c ? (j6c) ol7Var : null;
                if (j6cVar != null) {
                    k6c k6cVar = hqdVar instanceof k6c ? (k6c) hqdVar : null;
                    if (k6cVar != null) {
                        k6cVar.A(j6cVar);
                        tu0.K(k6cVar.a, 300L, new vu5((wz7) this.Y, 26, j6cVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public long k(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).getItemId();
            default:
                return super.k(i);
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).getI0();
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final /* bridge */ /* synthetic */ void r(dec decVar, int i) {
        switch (this.X) {
            case 0:
                r((hqd) decVar, i);
                break;
            default:
                r((hqd) decVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                Continuation continuation = null;
                if (i == gja.g) {
                    return new h6e(new ufd(viewGroup.getContext(), null));
                }
                if (i != gja.m && i != gja.h) {
                    if (i == gja.s) {
                        TextView textView = new TextView(viewGroup.getContext());
                        float f = 16;
                        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
                        i4f.u.b(textView, du4.b);
                        v3c.y(new v9(3, continuation, 27), textView);
                        return new az0(textView, 19);
                    }
                    if (i == gja.r) {
                        return new s3e(viewGroup.getContext());
                    }
                    String name = j6e.class.getName();
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
                    }
                    return new az0(new View(viewGroup.getContext()), 20);
                }
                return new i6e(viewGroup.getContext());
            default:
                int i2 = apc.a;
                l6c l6cVar = (l6c) this.Z;
                if (i != i2) {
                    return new k6c(viewGroup.getContext(), l6cVar);
                }
                Context context = viewGroup.getContext();
                lwa lwaVar = new lwa(9, this);
                ImageView imageView = new ImageView(context);
                int iG = tu0.G(l6cVar.a() * fk4.d().getDisplayMetrics().density);
                imageView.setLayoutParams(new pdc(iG, iG));
                tu0.K(imageView, 300L, new m6(19, lwaVar));
                v3c.y(new j27(iG, null, 1), imageView);
                return new az0(imageView, 10);
        }
    }

    public j6e(ExecutorService executorService, m6e m6eVar, m6e m6eVar2, m6e m6eVar3) {
        super(executorService);
        this.Y = m6eVar;
        this.Z = m6eVar2;
        this.s0 = m6eVar3;
    }
}
