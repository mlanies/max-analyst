package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class il9 extends v2 implements p03, nse {
    public static final int y0 = yyb.layout_send_location;
    public Group X;
    public TextView Y;
    public ImageButton Z;
    public final boolean o;
    public ChipGroup s0;
    public OneMeTitleSubtitleButton t0;
    public Chip u0;
    public Chip v0;
    public ir7 w0;
    public final jt3 x0;

    public il9(Context context, boolean z) {
        super(context);
        this.x0 = new jt3(new yt8(10, this));
        this.o = z;
    }

    public final void A(ir7 ir7Var) throws IOException {
        this.w0 = ir7Var;
        int iS = au1.s(ir7Var.d);
        if (iS == 1) {
            this.X.setVisibility(8);
            this.t0.setTitle(((Context) this.b).getString(this.o ? jpc.M2 : jpc.x2));
        } else if (iS == 2) {
            this.X.setVisibility(0);
            this.t0.setTitle((CharSequence) this.x0.get());
            int iOrdinal = ir7Var.e.ordinal();
            if (iOrdinal == 0) {
                ChipGroup chipGroup = this.s0;
                int i = xxb.layout_send_location__duration_20m;
                ana anaVar = chipGroup.v0;
                n18 n18Var = (n18) ((HashMap) anaVar.c).get(Integer.valueOf(i));
                if (n18Var != null && anaVar.f(n18Var)) {
                    anaVar.m();
                }
            } else if (iOrdinal == 1) {
                ChipGroup chipGroup2 = this.s0;
                int i2 = xxb.layout_send_location__duration_1h;
                ana anaVar2 = chipGroup2.v0;
                n18 n18Var2 = (n18) ((HashMap) anaVar2.c).get(Integer.valueOf(i2));
                if (n18Var2 != null && anaVar2.f(n18Var2)) {
                    anaVar2.m();
                }
            } else if (iOrdinal == 2) {
                ChipGroup chipGroup3 = this.s0;
                int i3 = xxb.layout_send_location__duration_3h;
                ana anaVar3 = chipGroup3.v0;
                n18 n18Var3 = (n18) ((HashMap) anaVar3.c).get(Integer.valueOf(i3));
                if (n18Var3 != null && anaVar3.f(n18Var3)) {
                    anaVar3.m();
                }
            } else if (iOrdinal == 3) {
                ChipGroup chipGroup4 = this.s0;
                int i4 = xxb.layout_send_location__duration_24h;
                ana anaVar4 = chipGroup4.v0;
                n18 n18Var4 = (n18) ((HashMap) anaVar4.c).get(Integer.valueOf(i4));
                if (n18Var4 != null && anaVar4.f(n18Var4)) {
                    anaVar4.m();
                }
            } else if (iOrdinal == 4) {
                ChipGroup chipGroup5 = this.s0;
                int i5 = xxb.layout_send_location__duration_no_limit;
                ana anaVar5 = chipGroup5.v0;
                n18 n18Var5 = (n18) ((HashMap) anaVar5.c).get(Integer.valueOf(i5));
                if (n18Var5 != null && anaVar5.f(n18Var5)) {
                    anaVar5.m();
                }
            }
            B();
        }
        if (ir7Var.i) {
            this.v0.setVisibility(8);
            this.u0.setVisibility(0);
        } else {
            this.v0.setVisibility(0);
            this.u0.setVisibility(8);
        }
    }

    public final void B() {
        int checkedChipId = this.s0.getCheckedChipId();
        int i = xxb.layout_send_location__duration_20m;
        Context context = (Context) this.b;
        this.t0.setSubtitle(context.getString(jpc.D2, checkedChipId == i ? ay7.m(fzb.tt_dates_minutes, (int) hr7.c.a, context) : checkedChipId == xxb.layout_send_location__duration_1h ? ay7.m(fzb.tt_dates_hours, (int) hr7.o.a, context) : checkedChipId == xxb.layout_send_location__duration_3h ? ay7.m(fzb.tt_dates_hours, (int) hr7.X.a, context) : checkedChipId == xxb.layout_send_location__duration_24h ? ay7.m(fzb.tt_dates_hours, (int) hr7.Y.a, context) : checkedChipId == xxb.layout_send_location__duration_no_limit ? context.getString(jpc.s0) : ""));
    }

    @Override // defpackage.nse
    public final void c() {
        View view = (View) this.c;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        this.Y.setTextColor(smeVarR.J);
        ChipGroup chipGroup = this.s0;
        int childCount = chipGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = chipGroup.getChildAt(i);
            if (childAt instanceof Chip) {
                Chip chip = (Chip) childAt;
                chip.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{smeVarR.m, smeVarR.F}));
                chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{smeVarR.k, smeVarR.H}));
            }
        }
        this.Z.setColorFilter(smeVarR.J, PorterDuff.Mode.SRC_IN);
        this.Z.setBackground(smeVarR.a());
    }

    @Override // defpackage.v2
    public final void m() throws IOException {
        this.X = (Group) ((View) this.c).findViewById(xxb.layout_send_location__live_group);
        this.Y = (TextView) ((View) this.c).findViewById(xxb.layout_send_location__tv_pick_duration);
        this.Z = (ImageButton) ((View) this.c).findViewById(xxb.layout_send_location__cancel_button);
        this.s0 = (ChipGroup) ((View) this.c).findViewById(xxb.layout_send_location__cp_duration);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) ((View) this.c).findViewById(xxb.layout_send_location__send_button);
        this.t0 = oneMeTitleSubtitleButton;
        int i = jpc.D2;
        Context context = (Context) this.b;
        String string = context.getString(i);
        int i2 = jpc.M2;
        oneMeTitleSubtitleButton.j(string, context.getString(i2));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_20m)).setText(ay7.m(fzb.tt_dates_minutes, (int) hr7.c.a, context));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_1h)).setText(ay7.m(fzb.tt_dates_hours, (int) hr7.o.a, context));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_3h)).setText(ay7.m(fzb.tt_dates_hours, (int) hr7.X.a, context));
        Chip chip = (Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_24h);
        this.v0 = chip;
        chip.setText(ay7.m(fzb.tt_dates_hours, (int) hr7.Y.a, context));
        this.u0 = (Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_no_limit);
        final int i3 = 0;
        tu0.K(this.t0, 300L, new View.OnClickListener(this) { // from class: gl9
            public final /* synthetic */ il9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        Iterator it = ((Set) this.b.a).iterator();
                        while (it.hasNext()) {
                            ((el9) it.next()).n(new fj0(5));
                        }
                        break;
                    default:
                        Iterator it2 = ((Set) this.b.a).iterator();
                        while (it2.hasNext()) {
                            ((el9) it2.next()).n(new fj0(4));
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        tu0.K(this.Z, 300L, new View.OnClickListener(this) { // from class: gl9
            public final /* synthetic */ il9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        Iterator it = ((Set) this.b.a).iterator();
                        while (it.hasNext()) {
                            ((el9) it.next()).n(new fj0(5));
                        }
                        break;
                    default:
                        Iterator it2 = ((Set) this.b.a).iterator();
                        while (it2.hasNext()) {
                            ((el9) it2.next()).n(new fj0(4));
                        }
                        break;
                }
            }
        });
        this.s0.setOnCheckedChangeListener(this);
        c();
        ((View) this.c).setOnTouchListener(new hl9());
        if (!this.o) {
            i2 = jpc.x2;
        }
        this.t0.setTitle(context.getString(i2));
    }
}
