package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class glb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        glb glbVar = (glb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        glbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        glb glbVar = new glb(continuation, this.Y);
        glbVar.X = obj;
        return glbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ProfileScreen profileScreen;
        boolean z;
        od2.a0(obj);
        tab tabVar = (tab) this.X;
        bc7[] bc7VarArr = ProfileScreen.D0;
        ProfileScreen profileScreen2 = this.Y;
        profileScreen2.p0().setRightActions(tabVar.b ? new pka(null, new vka(yfa.f, new c01(9, profileScreen2))) : nka.a);
        bc7[] bc7VarArr2 = ProfileScreen.D0;
        s5a s5aVar = (s5a) profileScreen2.t0.T0(profileScreen2, bc7VarArr2[4]);
        s5aVar.setCustomOverlay(tabVar.g);
        Long l = new Long(tabVar.a);
        CharSequence charSequence = tabVar.f;
        if (charSequence == null) {
            charSequence = "";
        }
        s5aVar.g(oag.a(charSequence, l), true);
        s5aVar.setAvatarUrls(tabVar.c);
        s5aVar.setAlpha(tabVar.j ? 0.4f : 1.0f);
        tu0.K(s5aVar, 300L, new e0d(11, profileScreen2));
        int i = 8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) profileScreen2.x0.T0(profileScreen2, bc7VarArr2[8]);
        jqe jqeVar = tabVar.h;
        CharSequence charSequenceB = jqeVar != null ? jqeVar.b(profileScreen2.getContext()) : null;
        boolean z2 = !(charSequenceB == null || charSequenceB.length() == 0);
        jqe jqeVar2 = tabVar.i;
        if (z2) {
            CharSequence charSequenceB2 = jqeVar2 != null ? jqeVar2.b(profileScreen2.getContext()) : null;
            if (!(charSequenceB2 == null || charSequenceB2.length() == 0)) {
                i = 0;
            }
        }
        appCompatTextView.setVisibility(i);
        CharSequence charSequenceB3 = jqeVar2 != null ? jqeVar2.b(profileScreen2.getContext()) : null;
        if (!(charSequenceB3 == null || charSequenceB3.length() == 0)) {
            ((AppCompatTextView) profileScreen2.w0.T0(profileScreen2, bc7VarArr2[7])).setText(charSequenceB3);
        }
        ((TextView) profileScreen2.v0.T0(profileScreen2, bc7VarArr2[6])).setText(jqeVar != null ? jqeVar.b(profileScreen2.getContext()) : null);
        cla claVarP0 = profileScreen2.p0();
        CharSequence gvdVar = tabVar.e;
        claVarP0.setTitle(gvdVar == null ? "" : gvdVar);
        TextView textViewO0 = profileScreen2.o0();
        boolean z3 = tabVar.k;
        if (z3) {
            int iD = br7.D(profileScreen2.getContext());
            ViewGroup.LayoutParams layoutParams = profileScreen2.o0().getLayoutParams();
            int marginStart = iD - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = profileScreen2.o0().getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            Context context = profileScreen2.getContext();
            TextPaint paint = profileScreen2.o0().getPaint();
            ww9 ww9Var = new ww9(22);
            if (gvdVar == null || gvdVar.length() == 0) {
                profileScreen = profileScreen2;
                z = z3;
                gvdVar = gvdVar != null ? gvdVar : "";
            } else {
                int I = i24.I(paint.getTextSize() / context.getResources().getDisplayMetrics().density);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gvdVar);
                spannableStringBuilder.append((char) 8288);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new fcf(context, I, false, ww9Var), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                gvd gvdVar2 = new gvd(spannableStringBuilder);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(gvdVar2, 0, gvdVar2.length(), paint, marginEnd);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).setIncludePad(false).build();
                int iMin = Math.min(staticLayoutBuild.getLineCount() - 1, 2);
                CharSequence charSequenceSubSequence = staticLayoutBuild.getText().subSequence(staticLayoutBuild.getLineStart(0), staticLayoutBuild.getLineEnd(iMin));
                if (tpa.f(charSequenceSubSequence, gvdVar2)) {
                    profileScreen = profileScreen2;
                    z = z3;
                    gvdVar = gvdVar2;
                } else {
                    z = z3;
                    profileScreen = profileScreen2;
                    StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(gvdVar2, staticLayoutBuild.getLineStart(iMin), staticLayoutBuild.getLineEnd(iMin), paint, rh4.q(h4f.f(I), fk4.d().getDisplayMetrics().density, rh4.q(h4f.i(I), fk4.d().getDisplayMetrics().density, marginEnd))).setAlignment(alignment).setIncludePad(false).build();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(w9e.M0(charSequenceSubSequence, staticLayoutBuild.getLineStart(iMin), staticLayoutBuild.getLineEnd(iMin), staticLayoutBuild2.getText().subSequence(staticLayoutBuild2.getLineStart(0), staticLayoutBuild2.getLineEnd(0) - 3)));
                    spannableStringBuilder2.append((char) 8288);
                    spannableStringBuilder2.append((CharSequence) "...");
                    spannableStringBuilder2.append((char) 8288);
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.setSpan(new fcf(context, I, false, ww9Var), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    gvdVar = new gvd(spannableStringBuilder2);
                }
            }
        } else {
            profileScreen = profileScreen2;
            z = z3;
        }
        textViewO0.setText(gvdVar);
        ProfileScreen.m0(profileScreen, profileScreen.p0(), z);
        return e5f.a;
    }
}
