package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    private static final e a = new e(Collections.EMPTY_LIST);

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).a);
        }
        return TextUtils.join(",", arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new e.a(applicationInfo.packageName, x0.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public e a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> installedPackages;
        if (installedPackagesProvider == null) {
            return a;
        }
        try {
            installedPackages = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            y0.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            installedPackages = null;
        }
        if (installedPackages != null && !installedPackages.isEmpty()) {
            List listB = b(installedPackages);
            if (listB.isEmpty()) {
                return a;
            }
            String strA = a(listB);
            String strF = p0.a(context).f();
            String strA2 = s.a(strA);
            if (strF.equals(strA2)) {
                y0.a("AppsDataProvider: Apps hash did not changed");
                return a;
            }
            y0.a("AppsDataProvider: Apps hash changed");
            p0.a(context).h(strA2);
            return new e(listB);
        }
        return a;
    }
}
