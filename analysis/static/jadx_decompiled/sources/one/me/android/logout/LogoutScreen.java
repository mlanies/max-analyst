package one.me.android.logout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ffa;
import defpackage.ifa;
import defpackage.nfa;
import defpackage.ote;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/logout/LogoutScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class LogoutScreen extends Widget {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public LogoutScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = true;
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        return true;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getIsDialog() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(ote.b0(-7829368, 0.5f));
        nfa nfaVar = new nfa(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        nfaVar.setLayoutParams(layoutParams);
        nfaVar.setAppearance(ffa.a);
        nfaVar.setSize(ifa.a);
        frameLayout.addView(nfaVar);
        return frameLayout;
    }
}
