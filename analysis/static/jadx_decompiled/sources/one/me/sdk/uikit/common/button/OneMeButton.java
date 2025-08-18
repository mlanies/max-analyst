package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a7a;
import defpackage.afa;
import defpackage.at;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bfa;
import defpackage.br7;
import defpackage.c7a;
import defpackage.caa;
import defpackage.cfa;
import defpackage.d7a;
import defpackage.dfa;
import defpackage.du4;
import defpackage.ffa;
import defpackage.fk4;
import defpackage.fka;
import defpackage.gfa;
import defpackage.hv0;
import defpackage.hy4;
import defpackage.i4f;
import defpackage.ifa;
import defpackage.iv0;
import defpackage.ix3;
import defpackage.je7;
import defpackage.jfa;
import defpackage.jv0;
import defpackage.k56;
import defpackage.kqe;
import defpackage.kre;
import defpackage.l6d;
import defpackage.lfa;
import defpackage.lz7;
import defpackage.nec;
import defpackage.nfa;
import defpackage.oi9;
import defpackage.pk5;
import defpackage.qp4;
import defpackage.rh4;
import defpackage.tu0;
import defpackage.w9e;
import defpackage.wy6;
import defpackage.x9a;
import defpackage.xoc;
import defpackage.z6a;
import defpackage.zea;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004!*1\u001eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R+\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u00100\u001a\u00020*2\u0006\u0010\"\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u0010\"\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R/\u0010>\u001a\u0004\u0018\u0001082\b\u0010\"\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010$\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010@\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\rR\u0011\u0010\u0016\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;R\u0014\u0010J\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeButton;", "Landroid/view/ViewGroup;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Le5f;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "setEndIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "(Ljava/lang/Integer;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "(I)V", "setTextBadge", "Landroid/widget/TextView;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "La7a;", "getInternalType", "()La7a;", "Lc7a;", "<set-?>", "a", "Ls7c;", "getSize", "()Lc7a;", "setSize", "(Lc7a;)V", "size", "Lb7a;", "b", "getMode", "()Lb7a;", "setMode", "(Lb7a;)V", "mode", "Lz6a;", "c", "getAppearance", "()Lz6a;", "setAppearance", "(Lz6a;)V", "appearance", "Lfka;", "o", "getCustomTheme", "()Lfka;", "setCustomTheme", "(Lfka;)V", "customTheme", "s0", "isProgressEnabled", "()Z", "setProgressEnabled", "", "getText", "()Ljava/lang/String;", "getCurrentTheme", "currentTheme", "getVerticalPaddingOffset", "()I", "verticalPaddingOffset", "common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class OneMeButton extends ViewGroup implements kre {
    public static final /* synthetic */ bc7[] B0 = {new oi9(OneMeButton.class, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;"), rh4.g(nec.a, OneMeButton.class, "mode", "getMode()Lone/me/sdk/uikit/common/button/OneMeButton$Mode;"), new oi9(OneMeButton.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;"), new oi9(OneMeButton.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new oi9(OneMeButton.class, "isProgressEnabled", "isProgressEnabled()Z")};
    public boolean A0;
    public final d7a a;
    public final d7a b;
    public final d7a c;
    public final d7a o;
    public final d7a s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final ShapeDrawable y0;
    public final RippleDrawable z0;

    public OneMeButton(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new d7a(this, 0);
        this.b = new d7a(this, 1);
        this.c = new d7a(this, 2);
        this.o = new d7a(this, 3);
        this.s0 = new d7a(this, 4);
        final int i = 0;
        this.t0 = tu0.r(3, new k56() { // from class: y6a
            @Override // defpackage.k56
            public final Object invoke() {
                OneMeButton oneMeButton = this;
                Context context2 = context;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = OneMeButton.B0;
                        nfa nfaVar = new nfa(context2);
                        nfaVar.setId(xoc.h);
                        nfaVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        pla.a(nfaVar, new q57(16, nfaVar, oneMeButton));
                        br7.b(oneMeButton, nfaVar, Integer.valueOf(oneMeButton.getChildCount()));
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr2 = OneMeButton.B0;
                        caa caaVar = new caa(context2);
                        int i2 = xoc.f;
                        caaVar.setId(i2);
                        oneMeButton.addView(caaVar, oneMeButton.b(i2));
                        return caaVar;
                }
            }
        });
        this.u0 = tu0.r(3, new hy4(context, 20));
        this.v0 = tu0.r(3, new hy4(context, 21));
        this.w0 = tu0.r(3, new hy4(context, 22));
        final int i2 = 1;
        this.x0 = tu0.r(3, new k56() { // from class: y6a
            @Override // defpackage.k56
            public final Object invoke() {
                OneMeButton oneMeButton = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = OneMeButton.B0;
                        nfa nfaVar = new nfa(context2);
                        nfaVar.setId(xoc.h);
                        nfaVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        pla.a(nfaVar, new q57(16, nfaVar, oneMeButton));
                        br7.b(oneMeButton, nfaVar, Integer.valueOf(oneMeButton.getChildCount()));
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr2 = OneMeButton.B0;
                        caa caaVar = new caa(context2);
                        int i22 = xoc.f;
                        caaVar.setId(i22);
                        oneMeButton.addView(caaVar, oneMeButton.b(i22));
                        return caaVar;
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.y0 = shapeDrawable;
        int i3 = qp4.u0.j(this).d().a.a.d;
        this.z0 = new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable, new ColorDrawable(-65536));
        this.A0 = true;
        setClipToOutline(true);
        e();
        j();
    }

    public static final void a(OneMeButton oneMeButton, int i, boolean z) {
        oneMeButton.getClass();
        pk5 pk5Var = new pk5(l6d.Z(new at(7, oneMeButton), new wy6(i, 2)));
        while (pk5Var.hasNext()) {
            ((View) pk5Var.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final a7a getInternalType() {
        bc7 bc7Var = B0[4];
        return ((Boolean) this.s0.b).booleanValue() ? a7a.c : (br7.H(this.u0) == br7.H(this.v0) || br7.H(this.w0)) ? a7a.a : a7a.b;
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    private final void setupTextViewParams(TextView textView) {
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextAlignment(4);
    }

    public final int b(int i) {
        int iX;
        if (i == xoc.i) {
            return 0;
        }
        if (i == xoc.k) {
            iX = l6d.X(lz7.m(this)) / 2;
        } else {
            if (i == xoc.f) {
                return l6d.X(lz7.m(this)) / 2;
            }
            if (i != xoc.g) {
                return -1;
            }
            iX = l6d.X(lz7.m(this));
        }
        return iX - 1;
    }

    public final void c(Integer num, boolean z) {
        je7 je7Var = this.x0;
        if (je7Var.a() || num != null) {
            caa caaVar = (caa) je7Var.getValue();
            caaVar.setVisibility(num != null ? 0 : 8);
            caaVar.g(num != null ? num.intValue() : 0, z);
            g();
            requestLayout();
        }
    }

    public final void d(Integer num, boolean z) {
        ImageView imageView = (ImageView) this.u0.getValue();
        imageView.setId(xoc.i);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.A0 = z;
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void e() {
        h();
        k();
        g();
        i();
        f();
        invalidate();
    }

    public final void f() {
        hv0 hv0VarC = lz7.c(getCurrentTheme(), getMode(), getAppearance(), isEnabled());
        Paint paint = this.y0.getPaint();
        Integer num = hv0VarC.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(hv0VarC.b);
        RippleDrawable rippleDrawable = this.z0;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
    }

    public final void g() {
        je7 je7Var = this.x0;
        if (je7Var.a()) {
            caa caaVar = (caa) je7Var.getValue();
            b7a mode = getMode();
            z6a appearance = getAppearance();
            int i = jv0.$EnumSwitchMapping$3[mode.ordinal()];
            x9a x9aVar = x9a.b;
            x9a x9aVar2 = x9a.X;
            if (i != 1) {
                int iOrdinal = appearance.ordinal();
                if (iOrdinal == 0) {
                    x9aVar = x9a.a;
                } else if (iOrdinal == 1) {
                    x9aVar = x9a.o;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x9aVar = x9aVar2;
                }
            } else if (appearance == z6a.c) {
                x9aVar = x9aVar2;
            }
            caaVar.setAppearance(x9aVar);
        }
    }

    public final z6a getAppearance() {
        bc7 bc7Var = B0[2];
        return (z6a) this.c.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = B0[3];
        return (fka) this.o.b;
    }

    public final b7a getMode() {
        bc7 bc7Var = B0[1];
        return (b7a) this.b.b;
    }

    public final c7a getSize() {
        bc7 bc7Var = B0[0];
        return (c7a) this.a.b;
    }

    public final String getText() {
        je7 je7Var = this.w0;
        return je7Var.a() ? ((TextView) je7Var.getValue()).getText().toString() : "";
    }

    public final void h() {
        fka currentTheme = getCurrentTheme();
        b7a mode = getMode();
        z6a appearance = getAppearance();
        int iOrdinal = mode.ordinal();
        int i = -1;
        if (iOrdinal == 0) {
            int iOrdinal2 = appearance.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                currentTheme.getIcon();
            } else if (iOrdinal2 == 2) {
                i = currentTheme.getIcon().b;
            } else if (iOrdinal2 == 3) {
                currentTheme.getIcon();
            } else {
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = currentTheme.getIcon().g;
            }
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal3 = appearance.ordinal();
            if (iOrdinal3 == 0) {
                i = currentTheme.getIcon().k;
            } else if (iOrdinal3 == 1) {
                i = currentTheme.getIcon().c;
            } else if (iOrdinal3 == 2) {
                i = currentTheme.getIcon().f;
            } else if (iOrdinal3 == 3) {
                i = currentTheme.getIcon().d;
            } else {
                if (iOrdinal3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                currentTheme.getIcon();
            }
        }
        if (this.A0) {
            je7 je7Var = this.u0;
            if (je7Var.a()) {
                ((ImageView) je7Var.getValue()).setImageTintList(ColorStateList.valueOf(i));
            }
        }
        je7 je7Var2 = this.v0;
        if (je7Var2.a()) {
            ((ImageView) je7Var2.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void i() {
        lfa lfaVar;
        je7 je7Var = this.t0;
        if (je7Var.a()) {
            nfa nfaVar = (nfa) je7Var.getValue();
            b7a mode = getMode();
            z6a appearance = getAppearance();
            int i = jv0.$EnumSwitchMapping$3[mode.ordinal()];
            gfa gfaVar = afa.a;
            if (i == 1) {
                int i2 = jv0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        gfaVar = zea.a;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gfaVar = dfa.a;
                    }
                }
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = jv0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i3 == 1) {
                    gfaVar = ffa.a;
                } else if (i3 != 2) {
                    cfa cfaVar = cfa.a;
                    if (i3 == 3 || i3 == 4) {
                        gfaVar = cfaVar;
                    } else if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    gfaVar = bfa.a;
                }
            }
            nfaVar.setAppearance(gfaVar);
            int i4 = jv0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i4 == 1) {
                lfaVar = jfa.a;
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                lfaVar = ifa.a;
            }
            nfaVar.setSize(lfaVar);
        }
    }

    public final void j() {
        iv0 iv0Var;
        kqe kqeVar;
        int iG;
        lfa lfaVar;
        setMinimumHeight(lz7.r(getSize()));
        setOutlineProvider(new ix3(lz7.d(getSize())));
        c7a size = getSize();
        int iOrdinal = getInternalType().ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = size.ordinal();
            if (iOrdinal2 == 0) {
                iv0Var = new iv0(tu0.G(12 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
            } else if (iOrdinal2 == 1) {
                iv0Var = new iv0(tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(10 * fk4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iv0Var = new iv0(tu0.G(20 * fk4.d().getDisplayMetrics().density), tu0.G(15 * fk4.d().getDisplayMetrics().density));
            }
        } else if (iOrdinal == 1) {
            int iOrdinal3 = size.ordinal();
            if (iOrdinal3 == 0) {
                float f = 6;
                iv0Var = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            } else if (iOrdinal3 == 1) {
                float f2 = 8;
                iv0Var = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f3 = 14;
                iv0Var = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal4 = size.ordinal();
            if (iOrdinal4 == 0) {
                iv0Var = new iv0(tu0.G(12 * fk4.d().getDisplayMetrics().density), tu0.G(4 * fk4.d().getDisplayMetrics().density));
            } else if (iOrdinal4 == 1) {
                iv0Var = new iv0(tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iv0Var = new iv0(tu0.G(20 * fk4.d().getDisplayMetrics().density), tu0.G(14 * fk4.d().getDisplayMetrics().density));
            }
        }
        int i = iv0Var.a;
        setPadding(i, 0, i, 0);
        int iOrdinal5 = getSize().ordinal();
        if (iOrdinal5 == 0) {
            kqeVar = i4f.E;
        } else if (iOrdinal5 == 1) {
            kqeVar = i4f.D;
        } else {
            if (iOrdinal5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kqeVar = i4f.C;
        }
        je7 je7Var = this.w0;
        if (je7Var.a()) {
            kqeVar.b((TextView) je7Var.getValue(), du4.b);
        }
        int iOrdinal6 = getSize().ordinal();
        if (iOrdinal6 == 0) {
            iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        } else {
            if (iOrdinal6 != 1 && iOrdinal6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        }
        je7 je7Var2 = this.u0;
        if (je7Var2.a()) {
            ImageView imageView = (ImageView) je7Var2.getValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iG;
            layoutParams.height = iG;
            imageView.setLayoutParams(layoutParams);
        }
        je7 je7Var3 = this.v0;
        if (je7Var3.a()) {
            ImageView imageView2 = (ImageView) je7Var3.getValue();
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iG;
            layoutParams2.height = iG;
            imageView2.setLayoutParams(layoutParams2);
        }
        je7 je7Var4 = this.t0;
        if (je7Var4.a()) {
            nfa nfaVar = (nfa) je7Var4.getValue();
            int i2 = jv0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i2 == 1) {
                lfaVar = jfa.a;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                lfaVar = ifa.a;
            }
            nfaVar.setSize(lfaVar);
        }
        requestLayout();
        requestLayout();
        invalidate();
    }

    public final void k() {
        je7 je7Var = this.w0;
        if (je7Var.a()) {
            ((TextView) je7Var.getValue()).setTextColor(lz7.S(getCurrentTheme(), getMode(), getAppearance(), isEnabled()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = (getMeasuredHeight() / 2) + getVerticalPaddingOffset();
        int measuredWidth = getMeasuredWidth();
        int paddingRight = measuredWidth - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        je7 je7Var = this.t0;
        if (br7.H(je7Var)) {
            nfa nfaVar = (nfa) je7Var.getValue();
            int measuredHeight2 = nfaVar.getMeasuredHeight() / 2;
            int i5 = measuredWidth / 2;
            nfaVar.layout(i5 - (nfaVar.getMeasuredWidth() / 2), measuredHeight - measuredHeight2, (nfaVar.getMeasuredWidth() / 2) + i5, measuredHeight + measuredHeight2);
            return;
        }
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        je7 je7Var2 = this.u0;
        if (br7.H(je7Var2)) {
            ImageView imageView = (ImageView) je7Var2.getValue();
            int measuredHeight3 = imageView.getMeasuredHeight() / 2;
            imageView.layout(paddingLeft, measuredHeight - measuredHeight3, imageView.getMeasuredWidth() + paddingLeft, measuredHeight3 + measuredHeight);
            paddingLeft += imageView.getMeasuredWidth() + iG;
        }
        je7 je7Var3 = this.v0;
        int measuredWidth2 = (paddingRight - paddingLeft) - (br7.H(je7Var3) ? ((ImageView) je7Var3.getValue()).getMeasuredWidth() + iG : 0);
        je7 je7Var4 = this.w0;
        if (br7.H(je7Var4)) {
            TextView textView = (TextView) je7Var4.getValue();
            int measuredWidth3 = textView.getMeasuredWidth();
            int measuredHeight4 = textView.getMeasuredHeight() / 2;
            je7 je7Var5 = this.x0;
            int measuredWidth4 = br7.H(je7Var5) ? ((caa) je7Var5.getValue()).getMeasuredWidth() + iG : 0;
            int i6 = ((measuredWidth2 - (measuredWidth3 + measuredWidth4)) / 2) + paddingLeft;
            int i7 = measuredWidth3 + i6;
            textView.layout(i6, measuredHeight - measuredHeight4, i7, measuredHeight4 + measuredHeight);
            if (br7.H(je7Var5)) {
                caa caaVar = (caa) je7Var5.getValue();
                int measuredHeight5 = caaVar.getMeasuredHeight() / 2;
                caaVar.layout(iG + i7, measuredHeight - measuredHeight5, i7 + measuredWidth4, measuredHeight5 + measuredHeight);
            }
        }
        if (br7.H(je7Var3)) {
            ImageView imageView2 = (ImageView) je7Var3.getValue();
            int measuredHeight6 = imageView2.getMeasuredHeight() / 2;
            imageView2.layout(paddingRight - imageView2.getMeasuredWidth(), measuredHeight - measuredHeight6, paddingRight, measuredHeight + measuredHeight6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        je7 je7Var = this.t0;
        if (br7.H(je7Var)) {
            nfa nfaVar = (nfa) je7Var.getValue();
            measureChild(nfaVar, i, i2);
            setMeasuredDimension(View.resolveSizeAndState(nfaVar.getMeasuredWidth() + paddingLeft, i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, nfaVar.getMeasuredHeight()), i2, 0), getMinimumHeight()));
            return;
        }
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        je7 je7Var2 = this.u0;
        boolean zH = br7.H(je7Var2);
        je7 je7Var3 = this.w0;
        je7 je7Var4 = this.x0;
        je7 je7Var5 = this.v0;
        if (zH) {
            ImageView imageView = (ImageView) je7Var2.getValue();
            measureChild(imageView, i, i2);
            paddingLeft += (br7.H(je7Var5) || br7.H(je7Var4) || br7.H(je7Var3)) ? imageView.getMeasuredWidth() + iG : imageView.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView.getMeasuredHeight());
        }
        if (br7.H(je7Var5)) {
            ImageView imageView2 = (ImageView) je7Var5.getValue();
            measureChild(imageView2, i, i2);
            paddingLeft += imageView2.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView2.getMeasuredHeight());
        }
        if (br7.H(je7Var4)) {
            caa caaVar = (caa) je7Var4.getValue();
            measureChild(caaVar, i, i2);
            paddingLeft += br7.H(je7Var5) ? caaVar.getMeasuredWidth() + iG : caaVar.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, caaVar.getMeasuredHeight());
        }
        if (!br7.H(je7Var3)) {
            setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i, 0), Math.max(View.resolveSizeAndState(paddingBottom, i2, 0), getMinimumHeight()));
            return;
        }
        TextView textView = (TextView) je7Var3.getValue();
        measureChild(textView, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - paddingLeft, Integer.MIN_VALUE), i2);
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft + ((br7.H(je7Var4) || br7.H(je7Var5)) ? iG + textView.getMeasuredWidth() : textView.getMeasuredWidth()), i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, textView.getMeasuredHeight()), i2, 0), getMinimumHeight()));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        e();
        je7 je7Var = this.x0;
        if (je7Var.a()) {
            ((caa) je7Var.getValue()).f(fkaVar);
        }
    }

    public final void setAppearance(z6a z6aVar) {
        this.c.o1(this, B0[2], z6aVar);
    }

    public final void setCustomTheme(fka fkaVar) {
        this.o.o1(this, B0[3], fkaVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        f();
        k();
        invalidate();
    }

    public final void setEndIcon(Drawable icon) {
        ImageView imageView = (ImageView) this.v0.getValue();
        imageView.setId(xoc.g);
        if (icon != null) {
            imageView.setImageDrawable(icon);
        }
        imageView.setVisibility(icon == null ? 8 : 0);
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void setMode(b7a b7aVar) {
        this.b.o1(this, B0[1], b7aVar);
    }

    public final void setProgressEnabled(boolean z) {
        this.s0.o1(this, B0[4], Boolean.valueOf(z));
    }

    public final void setSize(c7a c7aVar) {
        this.a.o1(this, B0[0], c7aVar);
    }

    public final void setText(CharSequence text) {
        TextView textView = (TextView) this.w0.getValue();
        textView.setId(xoc.k);
        textView.setText(text);
        setupTextViewParams(textView);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }

    public final void setTextBadge(CharSequence text) {
        je7 je7Var = this.x0;
        if (je7Var.a() || !(text == null || w9e.C0(text))) {
            caa caaVar = (caa) je7Var.getValue();
            caaVar.setVisibility(true ^ (text == null || text.length() == 0) ? 0 : 8);
            if (text != null) {
                caaVar.setText(text.toString());
            }
            g();
        }
    }

    public final void setEndIcon(Integer resId) {
        ImageView imageView = (ImageView) this.v0.getValue();
        imageView.setId(xoc.g);
        if (resId != null) {
            imageView.setImageResource(resId.intValue());
        }
        imageView.setVisibility(resId == null ? 8 : 0);
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void setText(int resId) {
        TextView textView = (TextView) this.w0.getValue();
        textView.setId(xoc.k);
        textView.setText(resId);
        setupTextViewParams(textView);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }
}
