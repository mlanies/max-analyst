package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ng8 extends hdc {
    public final LayoutInflater X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList o = new ArrayList();
    public final Drawable s0;
    public final Drawable t0;
    public mg8 u0;
    public final int v0;
    public final AccelerateDecelerateInterpolator w0;
    public final /* synthetic */ pg8 x0;

    public ng8(pg8 pg8Var) {
        this.x0 = pg8Var;
        this.X = LayoutInflater.from(pg8Var.y0);
        int i = qsb.mediaRouteDefaultIconDrawable;
        Context context = pg8Var.y0;
        this.Y = lh8.e(context, i);
        this.Z = lh8.e(context, qsb.mediaRouteTvIconDrawable);
        this.s0 = lh8.e(context, qsb.mediaRouteSpeakerIconDrawable);
        this.t0 = lh8.e(context, qsb.mediaRouteSpeakerGroupIconDrawable);
        this.v0 = context.getResources().getInteger(iyb.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w0 = new AccelerateDecelerateInterpolator();
        F();
    }

    public final void C(View view, int i) {
        vf8 vf8Var = new vf8(view, i, view.getLayoutParams().height, 1);
        vf8Var.setAnimationListener(new rf8(1, this));
        vf8Var.setDuration(this.v0);
        vf8Var.setInterpolator(this.w0);
        view.startAnimation(vf8Var);
    }

    public final Drawable D(dh8 dh8Var) {
        Uri uri = dh8Var.f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.x0.y0.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = dh8Var.m;
        return i != 1 ? i != 2 ? dh8Var.e() ? this.t0 : this.Y : this.s0 : this.Z;
    }

    public final void E() {
        pg8 pg8Var = this.x0;
        pg8Var.x0.clear();
        ArrayList arrayList = pg8Var.x0;
        ArrayList arrayList2 = pg8Var.v0;
        ArrayList arrayList3 = new ArrayList();
        ch8 ch8Var = pg8Var.t0.a;
        ch8Var.getClass();
        eh8.b();
        for (dh8 dh8Var : Collections.unmodifiableList(ch8Var.b)) {
            gaa gaaVarB = pg8Var.t0.b(dh8Var);
            if (gaaVarB != null && gaaVarB.B()) {
                arrayList3.add(dh8Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        m();
    }

    public final void F() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        pg8 pg8Var = this.x0;
        this.u0 = new mg8(1, pg8Var.t0);
        ArrayList arrayList2 = pg8Var.u0;
        if (arrayList2.isEmpty()) {
            arrayList.add(new mg8(3, pg8Var.t0));
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new mg8(3, (dh8) it.next()));
            }
        }
        ArrayList arrayList3 = pg8Var.v0;
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                dh8 dh8Var = (dh8) it2.next();
                if (!arrayList2.contains(dh8Var)) {
                    if (!z2) {
                        pg8Var.t0.getClass();
                        sg8 sg8VarA = dh8.a();
                        String strJ = sg8VarA != null ? sg8VarA.j() : null;
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = pg8Var.y0.getString(n1c.mr_dialog_groupable_header);
                        }
                        arrayList.add(new mg8(2, strJ));
                        z2 = true;
                    }
                    arrayList.add(new mg8(3, dh8Var));
                }
            }
        }
        ArrayList arrayList4 = pg8Var.w0;
        if (!arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                dh8 dh8Var2 = (dh8) it3.next();
                dh8 dh8Var3 = pg8Var.t0;
                if (dh8Var3 != dh8Var2) {
                    if (!z) {
                        dh8Var3.getClass();
                        sg8 sg8VarA2 = dh8.a();
                        String strK = sg8VarA2 != null ? sg8VarA2.k() : null;
                        if (TextUtils.isEmpty(strK)) {
                            strK = pg8Var.y0.getString(n1c.mr_dialog_transferable_header);
                        }
                        arrayList.add(new mg8(2, strK));
                        z = true;
                    }
                    arrayList.add(new mg8(4, dh8Var2));
                }
            }
        }
        E();
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o.size() + 1;
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        mg8 mg8Var;
        if (i == 0) {
            mg8Var = this.u0;
        } else {
            mg8Var = (mg8) this.o.get(i - 1);
        }
        return mg8Var.b;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        gaa gaaVarB;
        rg8 rg8Var;
        ArrayList arrayList = this.o;
        int i2 = (i == 0 ? this.u0 : (mg8) arrayList.get(i - 1)).b;
        boolean z = true;
        mg8 mg8Var = i == 0 ? this.u0 : (mg8) arrayList.get(i - 1);
        pg8 pg8Var = this.x0;
        int i3 = 0;
        if (i2 == 1) {
            pg8Var.G0.put(((dh8) mg8Var.a).c, (e) decVar);
            f fVar = (f) decVar;
            pg8 pg8Var2 = fVar.L0.x0;
            if (pg8Var2.d1 && Collections.unmodifiableList(pg8Var2.t0.u).size() > 1) {
                i3 = fVar.K0;
            }
            View view = fVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            dh8 dh8Var = (dh8) mg8Var.a;
            fVar.A(dh8Var);
            fVar.J0.setText(dh8Var.d);
            return;
        }
        if (i2 == 2) {
            ((lg8) decVar).F0.setText(mg8Var.a.toString());
            return;
        }
        float f = 1.0f;
        if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            kg8 kg8Var = (kg8) decVar;
            dh8 dh8Var2 = (dh8) mg8Var.a;
            kg8Var.K0 = dh8Var2;
            ImageView imageView = kg8Var.G0;
            imageView.setVisibility(0);
            kg8Var.H0.setVisibility(4);
            ng8 ng8Var = kg8Var.L0;
            List listUnmodifiableList = Collections.unmodifiableList(ng8Var.x0.t0.u);
            if (listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == dh8Var2) {
                f = kg8Var.J0;
            }
            View view2 = kg8Var.F0;
            view2.setAlpha(f);
            view2.setOnClickListener(new e0d(8, kg8Var));
            imageView.setImageDrawable(ng8Var.D(dh8Var2));
            kg8Var.I0.setText(dh8Var2.d);
            return;
        }
        pg8Var.G0.put(((dh8) mg8Var.a).c, (e) decVar);
        g gVar = (g) decVar;
        dh8 dh8Var3 = (dh8) mg8Var.a;
        ng8 ng8Var2 = gVar.S0;
        pg8 pg8Var3 = ng8Var2.x0;
        if (dh8Var3 == pg8Var3.t0 && Collections.unmodifiableList(dh8Var3.u).size() > 0) {
            Iterator it = Collections.unmodifiableList(dh8Var3.u).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dh8 dh8Var4 = (dh8) it.next();
                if (!pg8Var3.v0.contains(dh8Var4)) {
                    dh8Var3 = dh8Var4;
                    break;
                }
            }
        }
        gVar.A(dh8Var3);
        Drawable drawableD = ng8Var2.D(dh8Var3);
        ImageView imageView2 = gVar.K0;
        imageView2.setImageDrawable(drawableD);
        gVar.M0.setText(dh8Var3.d);
        CheckBox checkBox = gVar.O0;
        checkBox.setVisibility(0);
        boolean zD = gVar.D(dh8Var3);
        boolean z2 = !pg8Var3.x0.contains(dh8Var3) && (!gVar.D(dh8Var3) || Collections.unmodifiableList(pg8Var3.t0.u).size() >= 2) && (!gVar.D(dh8Var3) || ((gaaVarB = pg8Var3.t0.b(dh8Var3)) != null && ((rg8Var = (rg8) gaaVarB.a) == null || rg8Var.c)));
        checkBox.setChecked(zD);
        gVar.L0.setVisibility(4);
        imageView2.setVisibility(0);
        View view3 = gVar.J0;
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        gVar.G0.setEnabled(z2 || zD);
        if (!z2 && !zD) {
            z = false;
        }
        gVar.H0.setEnabled(z);
        e0d e0dVar = gVar.R0;
        view3.setOnClickListener(e0dVar);
        checkBox.setOnClickListener(e0dVar);
        if (zD && !gVar.F0.e()) {
            i3 = gVar.Q0;
        }
        RelativeLayout relativeLayout = gVar.N0;
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        float f2 = gVar.P0;
        view3.setAlpha((z2 || zD) ? 1.0f : f2);
        if (!z2 && zD) {
            f = f2;
        }
        checkBox.setAlpha(f);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(syb.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new lg8(layoutInflater.inflate(syb.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(syb.mr_cast_route_item, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new kg8(this, layoutInflater.inflate(syb.mr_cast_group_item, viewGroup, false));
    }

    @Override // defpackage.hdc
    public final void y(dec decVar) {
        this.x0.G0.values().remove(decVar);
    }
}
