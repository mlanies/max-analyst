package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ai3;
import defpackage.e5;
import defpackage.nd7;
import defpackage.xxb;
import defpackage.yyb;
import java.lang.reflect.InvocationTargetException;
import ru.ok.messages.views.widgets.BlockedAttachView;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgAttachUnknown extends FrgAttachView {
    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || g1() == null) {
            return true;
        }
        b0().finish();
        return true;
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_unknown_attach_view, viewGroup, false);
        z1();
        BlockedAttachView blockedAttachView = (BlockedAttachView) slideOutLayout.findViewById(xxb.frg_unknown_attach__deleted_view);
        blockedAttachView.a.setText(this.Z.getString("ru.ok.tamtam.extra.TEXT"));
        blockedAttachView.setBackgroundColor(-16777216);
        nd7.h(blockedAttachView, new e5(8, this));
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        ai3 ai3VarV1 = v1();
        if (ai3VarV1 != null) {
            ai3VarV1.h();
        }
        A1(slideOutLayout, blockedAttachView);
        return slideOutLayout;
    }

    @Override // ru.ok.messages.media.attaches.fragments.FrgAttachView
    public final void y1(boolean z) {
    }
}
