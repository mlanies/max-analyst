package ru.ok.utils.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ag0;
import defpackage.bc7;
import defpackage.ee4;
import defpackage.fm9;
import defpackage.khe;
import defpackage.nec;
import defpackage.nse;
import defpackage.oi9;
import defpackage.rh4;
import defpackage.sc0;
import defpackage.sme;
import defpackage.yj;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R/\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/utils/widgets/BadgeCountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lnse;", "", "backgroundColor", "Le5f;", "setBackgroundColor", "(I)V", "", "u0", "Z", "getNeedPlusIndicator", "()Z", "setNeedPlusIndicator", "(Z)V", "needPlusIndicator", "v0", "getManageVisibility", "setManageVisibility", "manageVisibility", "<set-?>", "w0", "Ls7c;", "getCount", "()I", "setCount", NewHtcHomeBadger.COUNT, "Lag0;", "x0", "getStyle", "()Lag0;", "setStyle", "(Lag0;)V", "style", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class BadgeCountView extends AppCompatTextView implements nse {
    public static final /* synthetic */ bc7[] z0 = {new oi9(BadgeCountView.class, NewHtcHomeBadger.COUNT, "getCount()I"), rh4.g(nec.a, BadgeCountView.class, "style", "getStyle()Lru/ok/utils/widgets/BadgeCountView$Style;")};

    /* renamed from: u0, reason: from kotlin metadata */
    public boolean needPlusIndicator;

    /* renamed from: v0, reason: from kotlin metadata */
    public boolean manageVisibility;
    public final sc0 w0;
    public final yj x0;
    public int y0;

    public BadgeCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(17);
        setIncludeFontPadding(false);
        setTextAlignment(4);
        setVisibility(8);
        c();
        this.manageVisibility = true;
        this.w0 = new sc0(this, context);
        this.x0 = new yj(1, this);
        this.y0 = -1;
    }

    private final ag0 getStyle() {
        bc7 bc7Var = z0[1];
        return (ag0) this.x0.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(ag0 ag0Var) {
        this.x0.o1(this, z0[1], ag0Var);
    }

    @Override // defpackage.nse
    public final void c() {
        sme smeVarR;
        if (isInEditMode()) {
            setTextColor(-1);
            setBackgroundColor(-16776961);
            setCount(20);
            this.needPlusIndicator = true;
            return;
        }
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        setTextColor(smeVarR.F);
        setBackgroundColor(smeVarR.H);
    }

    public final int getCount() {
        bc7 bc7Var = z0[0];
        return ((Number) this.w0.b).intValue();
    }

    public final boolean getManageVisibility() {
        return this.manageVisibility;
    }

    public final boolean getNeedPlusIndicator() {
        return this.needPlusIndicator;
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        this.y0 = backgroundColor;
        Drawable background = getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(backgroundColor);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(backgroundColor);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(backgroundColor);
        }
    }

    public final void setCount(int i) {
        this.w0.o1(this, z0[0], Integer.valueOf(i));
    }

    public final void setManageVisibility(boolean z) {
        this.manageVisibility = z;
    }

    public final void setNeedPlusIndicator(boolean z) {
        this.needPlusIndicator = z;
    }
}
