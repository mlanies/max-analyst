package com.my.tracker;

import android.content.pm.PackageInfo;
import com.my.tracker.obfuscated.y0;
import com.my.tracker.obfuscated.z0;
import defpackage.u2a;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MyTrackerConfig {
    private final z0 a;

    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    @FunctionalInterface
    public interface Logger {
        void log(int i, String str, Throwable th);
    }

    public interface OkHttpClientProvider {
        u2a getOkHttpClient();
    }

    private MyTrackerConfig(z0 z0Var) {
        this.a = z0Var;
    }

    public static MyTrackerConfig a(z0 z0Var) {
        return new MyTrackerConfig(z0Var);
    }

    public String getApkPreinstallParams() {
        return this.a.a();
    }

    public int getBufferingPeriod() {
        return this.a.e();
    }

    public int getForcingPeriod() {
        return this.a.f();
    }

    public String getId() {
        return this.a.g();
    }

    public int getLaunchTimeout() {
        return this.a.h();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.a.m();
    }

    public boolean isKidMode() {
        return this.a.n();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.a.o();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.a.p();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.a.q();
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.a.a(str);
        return this;
    }

    public MyTrackerConfig setBackgroundExecutor(Executor executor) {
        this.a.a(executor);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.a.a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.a.t();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.a.b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.a.a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setKidMode(boolean z) {
        this.a.b(z);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.a.c(i);
        return this;
    }

    public MyTrackerConfig setLogger(Logger logger) {
        y0.a(logger);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.a.a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.a.c(str);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.a.c(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.a.d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.a.e(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.a.e(str);
        return this;
    }
}
