package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class bn1 {
    public final Context a;

    public bn1(Context context) {
        this.a = context;
    }

    public static String e(Long l) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        long j = 3600;
        long j2 = jLongValue / j;
        long j3 = 60;
        long j4 = (jLongValue % j) / j3;
        long j5 = jLongValue % j3;
        return j2 > 0 ? String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final iqe a(eqe eqeVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(eqeVar.b(this.a));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
        return new iqe(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u51 b(oqf oqfVar) {
        Drawable drawableE;
        s51 s51Var = (s51) oqfVar;
        boolean zEquals = s51Var.equals(f51.c);
        pq9 pq9Var = qp4.u0;
        Context context = this.a;
        if (zEquals) {
            drawableE = dy7.E(pub.check_outline_16, pq9Var.o(context).c.getIcon().f, context);
        } else if (s51Var.equals(g51.c)) {
            drawableE = h();
        } else if (s51Var.equals(i51.c)) {
            drawableE = dy7.E(ztb.ic_connection_fill_16, pq9Var.o(context).c.getIcon().c, context);
        } else {
            if (!s51Var.equals(o51.c)) {
                return null;
            }
            drawableE = dy7.E(pub.ic_microphone_off_fill_16, pq9Var.o(context).c.getIcon().f, context);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(oqfVar.a));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.setSpan(new yl5(drawableE, (sl5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return new u51(s51Var.getPriority(), spannableStringBuilder);
    }

    public final SpannableStringBuilder c(boolean z) {
        Integer numValueOf = Integer.valueOf(f0c.call_incoming_video_call);
        if (!z) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : f0c.call_incoming_audio_call;
        Context context = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wg0.i("   ", context.getString(iIntValue)));
        Drawable drawableB = kt3.b(context, x7a.V);
        drawableB.setBounds(0, 0, drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new yl5(drawableB, (sl5) null, 6), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, boolean z, int i, boolean z2, boolean z3, boolean z4, i95 i95Var) {
        Drawable drawableE;
        if (charSequence == null) {
            return null;
        }
        if (z && (((i95Var instanceof e95) || (i95Var instanceof g95)) && z3)) {
            drawableE = h();
        } else if (z || !z2 || (i95Var instanceof e95) || (i95Var instanceof g95)) {
            pq9 pq9Var = qp4.u0;
            Context context = this.a;
            if (!z && z4) {
                drawableE = dy7.E(ztb.ic_share_screen_20, pq9Var.o(context).c.getIcon().f, context);
                float f = 12;
                drawableE.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            } else if (i == 2) {
                drawableE = dy7.E(ztb.ic_microphone_disable_12, pq9Var.o(context).c.getIcon().f, context);
                float f2 = 12;
                drawableE.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            } else if (i == 1) {
                mtd mtdVar = new mtd(context, pq9Var.b(context).i(), new we1(4));
                float f3 = 12;
                mtdVar.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                drawableE = mtdVar;
            } else {
                drawableE = null;
            }
        } else {
            drawableE = h();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (drawableE != null) {
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new yl5(drawableE, (sl5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String f(boolean z, boolean z2, boolean z3, i95 i95Var) {
        Context context = this.a;
        if (!z3 && !z2 && (((i95Var instanceof e95) || (i95Var instanceof g95)) && !z)) {
            return context.getString(f0c.call_waiting);
        }
        if (((i95Var instanceof e95) || (i95Var instanceof g95)) && !z3) {
            return context.getString(f0c.call_connecting);
        }
        if (!(i95Var instanceof b95)) {
            return null;
        }
        switch (an1.$EnumSwitchMapping$0[au1.s(((b95) i95Var).b)]) {
            case 1:
                return context.getString(f0c.call_opponent_unavailable);
            case 2:
                return context.getString(f0c.call_opponent_unavailable_busy);
            case 3:
                return context.getString(f0c.call_opponent_failed);
            case 4:
                return context.getString(f0c.call_opponent_unavailable_privacy);
            case 5:
                return context.getString(f0c.call_opponent_failed_timout);
            case 6:
                return context.getString(f0c.call_group_was_removed_from_call);
            case 7:
                return context.getString(f0c.call_group_was_removed_from_waiting_room);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final SpannableStringBuilder g(boolean z, int i, CharSequence charSequence, boolean z2, boolean z3, boolean z4, boolean z5, i95 i95Var) {
        CharSequence string = charSequence;
        Context context = this.a;
        if (z || !z5) {
            if (z2 || z) {
                if (z) {
                    string = context.getString(f0c.call_me_member);
                }
            }
            return d(charSequence, z, i, z3, z4, z5, i95Var);
        }
        string = context.getString(b8a.e0, string != null ? (String) x53.i0(w9e.P0(charSequence, new char[]{' '})) : null);
        charSequence = string;
        return d(charSequence, z, i, z3, z4, z5, i95Var);
    }

    public final oo7 h() {
        int i = x7a.T;
        pq9 pq9Var = qp4.u0;
        Context context = this.a;
        pq9Var.o(context).c.getIcon();
        oo7 oo7Var = new oo7(i, -1, context);
        float f = 12;
        oo7Var.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return oo7Var;
    }
}
