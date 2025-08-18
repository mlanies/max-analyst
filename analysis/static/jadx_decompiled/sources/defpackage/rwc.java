package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class rwc extends LinearLayout {
    public static final AccelerateDecelerateInterpolator x0 = new AccelerateDecelerateInterpolator();
    public k56 a;
    public final je7 b;
    public k56 c;
    public final je7 o;
    public k56 s0;
    public final je7 t0;
    public final EnumMap u0;
    public final EnumMap v0;
    public final EnumMap w0;

    public rwc(final Context context) {
        super(context);
        this.a = new hbc(12);
        final int i = 0;
        this.b = tu0.r(3, new k56() { // from class: kwc
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        iwc iwcVar = new iwc(context);
                        iwcVar.setImageDrawable(kt3.b(iwcVar.getContext(), yfa.t));
                        final rwc rwcVar = this;
                        final int i2 = 0;
                        tu0.K(iwcVar, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        rwcVar.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar.c.invoke();
                                        break;
                                    default:
                                        rwcVar.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = iwcVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, tu0.G(4 * fk4.d().getDisplayMetrics().density));
                        iwcVar.setLayoutParams(marginLayoutParams);
                        return iwcVar;
                    case 1:
                        iwc iwcVar2 = new iwc(context);
                        iwcVar2.setImageDrawable(kt3.b(iwcVar2.getContext(), yfa.p));
                        final rwc rwcVar2 = this;
                        final int i3 = 1;
                        tu0.K(iwcVar2, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        rwcVar2.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar2.c.invoke();
                                        break;
                                    default:
                                        rwcVar2.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = iwcVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar2.setLayoutParams(marginLayoutParams2);
                        return iwcVar2;
                    default:
                        iwc iwcVar3 = new iwc(context);
                        iwcVar3.setImageDrawable(kt3.b(iwcVar3.getContext(), yfa.o));
                        final rwc rwcVar3 = this;
                        final int i4 = 2;
                        tu0.K(iwcVar3, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        rwcVar3.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar3.c.invoke();
                                        break;
                                    default:
                                        rwcVar3.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = iwcVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar3.setLayoutParams(marginLayoutParams3);
                        return iwcVar3;
                }
            }
        });
        this.c = new hbc(12);
        final int i2 = 1;
        this.o = tu0.r(3, new k56() { // from class: kwc
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        iwc iwcVar = new iwc(context);
                        iwcVar.setImageDrawable(kt3.b(iwcVar.getContext(), yfa.t));
                        final rwc rwcVar = this;
                        final int i22 = 0;
                        tu0.K(iwcVar, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        rwcVar.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar.c.invoke();
                                        break;
                                    default:
                                        rwcVar.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = iwcVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, tu0.G(4 * fk4.d().getDisplayMetrics().density));
                        iwcVar.setLayoutParams(marginLayoutParams);
                        return iwcVar;
                    case 1:
                        iwc iwcVar2 = new iwc(context);
                        iwcVar2.setImageDrawable(kt3.b(iwcVar2.getContext(), yfa.p));
                        final rwc rwcVar2 = this;
                        final int i3 = 1;
                        tu0.K(iwcVar2, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        rwcVar2.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar2.c.invoke();
                                        break;
                                    default:
                                        rwcVar2.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = iwcVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar2.setLayoutParams(marginLayoutParams2);
                        return iwcVar2;
                    default:
                        iwc iwcVar3 = new iwc(context);
                        iwcVar3.setImageDrawable(kt3.b(iwcVar3.getContext(), yfa.o));
                        final rwc rwcVar3 = this;
                        final int i4 = 2;
                        tu0.K(iwcVar3, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        rwcVar3.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar3.c.invoke();
                                        break;
                                    default:
                                        rwcVar3.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = iwcVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar3.setLayoutParams(marginLayoutParams3);
                        return iwcVar3;
                }
            }
        });
        this.s0 = new hbc(12);
        final int i3 = 2;
        this.t0 = tu0.r(3, new k56() { // from class: kwc
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        iwc iwcVar = new iwc(context);
                        iwcVar.setImageDrawable(kt3.b(iwcVar.getContext(), yfa.t));
                        final rwc rwcVar = this;
                        final int i22 = 0;
                        tu0.K(iwcVar, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        rwcVar.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar.c.invoke();
                                        break;
                                    default:
                                        rwcVar.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = iwcVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, tu0.G(4 * fk4.d().getDisplayMetrics().density));
                        iwcVar.setLayoutParams(marginLayoutParams);
                        return iwcVar;
                    case 1:
                        iwc iwcVar2 = new iwc(context);
                        iwcVar2.setImageDrawable(kt3.b(iwcVar2.getContext(), yfa.p));
                        final rwc rwcVar2 = this;
                        final int i32 = 1;
                        tu0.K(iwcVar2, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        rwcVar2.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar2.c.invoke();
                                        break;
                                    default:
                                        rwcVar2.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = iwcVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar2.setLayoutParams(marginLayoutParams2);
                        return iwcVar2;
                    default:
                        iwc iwcVar3 = new iwc(context);
                        iwcVar3.setImageDrawable(kt3.b(iwcVar3.getContext(), yfa.o));
                        final rwc rwcVar3 = this;
                        final int i4 = 2;
                        tu0.K(iwcVar3, 300L, new View.OnClickListener() { // from class: jwc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        rwcVar3.a.invoke();
                                        break;
                                    case 1:
                                        rwcVar3.c.invoke();
                                        break;
                                    default:
                                        rwcVar3.s0.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = iwcVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        iwcVar3.setLayoutParams(marginLayoutParams3);
                        return iwcVar3;
                }
            }
        });
        this.u0 = new EnumMap(lwc.class);
        this.v0 = new EnumMap(lwc.class);
        this.w0 = new EnumMap(lwc.class);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(lwc lwcVar, EnumMap enumMap, EnumMap enumMap2, m56 m56Var) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(lwcVar);
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(lwcVar);
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        enumMap2.put((EnumMap) lwcVar, (lwc) null);
        enumMap.put((EnumMap) lwcVar, (lwc) m56Var.invoke(valueAnimator));
    }

    private final iwc getMentionButton() {
        return (iwc) this.o.getValue();
    }

    private final iwc getReactionButton() {
        return (iwc) this.t0.getValue();
    }

    private final iwc getScrollToBottomButton() {
        return (iwc) this.b.getValue();
    }

    public final void b(lwc lwcVar) {
        iwc iwcVarD = d(lwcVar);
        EnumMap enumMap = this.v0;
        if (enumMap.get(lwcVar) != null) {
            return;
        }
        ViewParent parent = iwcVarD.getParent();
        EnumMap enumMap2 = this.u0;
        if (parent == null && enumMap2.get(lwcVar) == null) {
            return;
        }
        EnumMap enumMap3 = this.w0;
        k56 k56Var = (k56) enumMap3.remove(lwcVar);
        if (k56Var != null) {
            k56Var.invoke();
        }
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(lwcVar);
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        enumMap.put((EnumMap) lwcVar, (lwc) null);
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(lwcVar);
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        enumMap2.put((EnumMap) lwcVar, (lwc) null);
        if (isInLayout()) {
            enumMap.put((EnumMap) lwcVar, (lwc) new ValueAnimator());
            enumMap3.put((EnumMap) lwcVar, (lwc) mpf.b(this, new nwc(this, lwcVar)));
        } else {
            iwc iwcVarD2 = d(lwcVar);
            a(lwcVar, enumMap, enumMap2, new qwc(iwcVarD2, this, lwcVar, this, iwcVarD2));
        }
    }

    public final void c(lwc lwcVar) {
        iwc iwcVarD = d(lwcVar);
        EnumMap enumMap = this.u0;
        if (enumMap.get(lwcVar) != null) {
            return;
        }
        ViewParent parent = iwcVarD.getParent();
        EnumMap enumMap2 = this.v0;
        if (parent == null || enumMap2.get(lwcVar) != null) {
            EnumMap enumMap3 = this.w0;
            k56 k56Var = (k56) enumMap3.remove(lwcVar);
            if (k56Var != null) {
                k56Var.invoke();
            }
            ValueAnimator valueAnimator = (ValueAnimator) enumMap2.get(lwcVar);
            if (valueAnimator != null) {
                ju0.i(valueAnimator);
            }
            enumMap2.put((EnumMap) lwcVar, (lwc) null);
            ValueAnimator valueAnimator2 = (ValueAnimator) enumMap.get(lwcVar);
            if (valueAnimator2 != null) {
                ju0.i(valueAnimator2);
            }
            enumMap.put((EnumMap) lwcVar, (lwc) null);
            if (isInLayout()) {
                enumMap.put((EnumMap) lwcVar, (lwc) new ValueAnimator());
                enumMap3.put((EnumMap) lwcVar, (lwc) mpf.b(this, new pt2(iwcVarD, this, lwcVar)));
                return;
            }
            if (iwcVarD.getParent() != null) {
                removeView(iwcVarD);
            }
            if (lwcVar == lwc.a) {
                addView(iwcVarD, getChildCount());
            } else {
                addView(iwcVarD, 0);
            }
            a(lwcVar, enumMap, enumMap2, new lr1(iwcVarD, this, lwcVar, 12));
        }
    }

    public final iwc d(lwc lwcVar) {
        int i = mwc.$EnumSwitchMapping$0[lwcVar.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setOnClickListener(m56 m56Var) {
        this.a = new ffb(1, m56Var);
        this.c = new ffb(2, m56Var);
        this.s0 = new ffb(3, m56Var);
    }
}
