package ru.ok.messages.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.eye;
import ru.ok.messages.location.view.SupportMapFragmentImpl;

/* loaded from: classes2.dex */
public class TamSupportMapFragment extends SupportMapFragmentImpl {
    public FrameLayout m1;
    public eye n1;

    @Override // androidx.fragment.app.a
    public final View k0() {
        return this.m1;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m1 = (FrameLayout) super.x0(layoutInflater, viewGroup, bundle);
        eye eyeVar = new eye(b0());
        this.n1 = eyeVar;
        eyeVar.addView(this.m1);
        return this.n1;
    }
}
