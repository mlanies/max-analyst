package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jf1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, je7 je7Var, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
        this.Y = je7Var;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                jf1 jf1Var = new jf1((je7) this.Y, (of1) this.t0, (Continuation) obj3, 0);
                jf1Var.Z = (Long) obj;
                jf1Var.s0 = (CharSequence) obj2;
                e5f e5fVar = e5f.a;
                jf1Var.o(e5fVar);
                return e5fVar;
            case 1:
                jf1 jf1Var2 = new jf1(this.t0, (je7) this.Y, (Continuation) obj3, 1);
                jf1Var2.Z = (e52) obj;
                jf1Var2.s0 = (uj3) obj2;
                return jf1Var2.o(e5f.a);
            case 2:
                jf1 jf1Var3 = new jf1((ImageView) this.Y, (TextView) this.t0, (Continuation) obj3, 2);
                jf1Var3.Z = (LinearLayout) obj;
                jf1Var3.s0 = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                jf1Var3.o(e5fVar2);
                return e5fVar2;
            case 3:
                jf1 jf1Var4 = new jf1((AppCompatImageView) this.Y, (TextView) this.t0, (Continuation) obj3, 3);
                jf1Var4.Z = (FrameLayout) obj;
                jf1Var4.s0 = (fka) obj2;
                e5f e5fVar3 = e5f.a;
                jf1Var4.o(e5fVar3);
                return e5fVar3;
            case 4:
                jf1 jf1Var5 = new jf1((xp8) this.Y, (String) this.t0, (Continuation) obj3, 4);
                jf1Var5.Z = (List) obj;
                jf1Var5.s0 = (List) obj2;
                return jf1Var5.o(e5f.a);
            case 5:
                jf1 jf1Var6 = new jf1(this.t0, (je7) this.Y, (Continuation) obj3, 5);
                jf1Var6.Z = (fqa) obj;
                jf1Var6.s0 = (d04) obj2;
                e5f e5fVar4 = e5f.a;
                jf1Var6.o(e5fVar4);
                return e5fVar4;
            case 6:
                jf1 jf1Var7 = new jf1((Drawable) this.s0, (Drawable) this.Y, (GradientDrawable) this.t0, (Continuation) obj3, 6);
                jf1Var7.Z = (fka) obj2;
                e5f e5fVar5 = e5f.a;
                jf1Var7.o(e5fVar5);
                return e5fVar5;
            default:
                jf1 jf1Var8 = new jf1((TextView) this.s0, (TextView) this.Y, (Drawable) this.t0, (Continuation) obj3, 7);
                jf1Var8.Z = (fka) obj2;
                e5f e5fVar6 = e5f.a;
                jf1Var8.o(e5fVar6);
                return e5fVar6;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Long l = (Long) this.Z;
                CharSequence charSequence = (CharSequence) this.s0;
                ((bn1) ((je7) this.Y).getValue()).getClass();
                String strE = bn1.e(l);
                if (strE != null && !w9e.C0(strE)) {
                    charSequence = ((Object) charSequence) + " · " + strE;
                }
                cn1 cn1Var = new cn1(1, "", charSequence);
                en1 en1Var = ((of1) this.t0).B0;
                en1Var.b = cn1Var;
                Iterator it = en1Var.a.iterator();
                while (it.hasNext()) {
                    ((dn1) it.next()).x(cn1Var);
                }
                break;
            case 1:
                od2.a0(obj);
                e52 e52Var = (e52) this.Z;
                uj3 uj3Var = (uj3) this.s0;
                boolean zS = uj3Var != null ? uj3Var.s() : e52Var.G();
                boolean z = (((se5) ((qe5) ((rq2) this.t0).z0.getValue())).t() && e52Var.y()) ? false : true;
                if (!e52Var.b.J.b(64)) {
                    if (!zS) {
                        if (!e52Var.T()) {
                            if (!e52Var.L()) {
                                if (!e52Var.S()) {
                                    if (!e52Var.W()) {
                                        boolean zI = e52Var.I();
                                        je7 je7Var = (je7) this.Y;
                                        if (!zI || !e52Var.c0() || e52Var.x() || !z || !e52Var.V((q33) je7Var.getValue())) {
                                            if (!e52Var.I() || !e52Var.c0() || e52Var.x() || !z || e52Var.V((q33) je7Var.getValue())) {
                                                if (e52Var.I() && !e52Var.c0()) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                od2.a0(obj);
                LinearLayout linearLayout = (LinearLayout) this.Z;
                fka fkaVar = (fka) this.s0;
                ((ImageView) this.Y).setColorFilter(fkaVar.getIcon().k);
                ((TextView) this.t0).setTextColor(fkaVar.getText().j);
                linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(fkaVar.d().a.a.h), null, new ColorDrawable(-65536)));
                break;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout = (FrameLayout) this.Z;
                fka fkaVar2 = (fka) this.s0;
                pq9 pq9Var = qp4.u0;
                ((AppCompatImageView) this.Y).setImageTintList(ColorStateList.valueOf(pq9Var.j(frameLayout).getIcon().k));
                ((TextView) this.t0).setTextColor(pq9Var.j(frameLayout).getText().j);
                frameLayout.setForeground(new RippleDrawable(ColorStateList.valueOf(fkaVar2.d().a.a.h), null, bt5.F0));
                break;
            case 4:
                od2.a0(obj);
                List list = (List) this.Z;
                List list2 = (List) this.s0;
                x53.t0(list, list2);
                xp8 xp8Var = (xp8) this.Y;
                String str = (String) this.t0;
                break;
            case 5:
                od2.a0(obj);
                fqa fqaVar = (fqa) this.Z;
                d04 d04Var = (d04) this.s0;
                q0e q0eVar = ((t1b) this.t0).o;
                do {
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, dz7.f(dz7.c(fqaVar, fqaVar.a.o(), d04Var.h, d04Var.f, (bn1) ((je7) this.Y).getValue(), d04Var.j, null), false, d04Var.h, d04Var.f)));
            case 6:
                od2.a0(obj);
                ((fka) this.Z).getIcon();
                ((Drawable) this.s0).setTint(-1);
                ((Drawable) this.Y).setTint(-1);
                ((GradientDrawable) this.t0).setTint(-1728053248);
                break;
            default:
                od2.a0(obj);
                fka fkaVar3 = (fka) this.Z;
                ((TextView) this.s0).setTextColor(fkaVar3.getText().e);
                ((TextView) this.Y).setTextColor(fkaVar3.getText().g);
                ((Drawable) this.t0).setTint(fkaVar3.getIcon().h);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, Object obj2, Drawable drawable, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
        this.Y = obj2;
        this.t0 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
        this.t0 = obj2;
    }
}
