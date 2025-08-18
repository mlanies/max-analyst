package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import defpackage.zr6;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* loaded from: classes.dex */
public class ZukHomeBadger implements Badger {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // me.leolin.shortcutbadger.Badger
    @TargetApi(11)
    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, zr6.g(i, "app_badge_count"));
    }

    @Override // me.leolin.shortcutbadger.Badger
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
