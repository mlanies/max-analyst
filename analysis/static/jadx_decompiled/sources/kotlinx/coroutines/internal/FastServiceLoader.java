package kotlinx.coroutines.internal;

import defpackage.d63;
import defpackage.eae;
import defpackage.j47;
import defpackage.m56;
import defpackage.v3c;
import defpackage.w9e;
import defpackage.x53;
import defpackage.z53;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0000¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b&\u0010\u0011R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "<init>", "()V", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "", "serviceClass", "createInstanceOf", "(Ljava/lang/Class;Ljava/lang/String;)Lkotlinx/coroutines/internal/MainDispatcherFactory;", "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "load", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "name", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "parse", "(Ljava/net/URL;)Ljava/util/List;", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "use", "(Ljava/util/jar/JarFile;Lm56;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "parseFile", "(Ljava/io/BufferedReader;)Ljava/util/List;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "()Ljava/util/List;", "loadMainDispatcherFactory", "loadProviders$kotlinx_coroutines_core", "loadProviders", "PREFIX", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();
    private static final String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> baseClass, String serviceClass) {
        try {
            return baseClass.cast(Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String name, ClassLoader loader, Class<S> service) throws ClassNotFoundException {
        Class<?> cls = Class.forName(name, false, loader);
        if (service.isAssignableFrom(cls)) {
            return service.cast(cls.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + service + ", but found " + cls).toString());
    }

    private final <S> List<S> load(Class<S> service, ClassLoader loader) {
        try {
            return loadProviders$kotlinx_coroutines_core(service, loader);
        } catch (Throwable unused) {
            return x53.D0(ServiceLoader.load(service, loader));
        }
    }

    private final List<String> parse(URL url) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!eae.o0(string, "jar", false)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = INSTANCE.parseFile(bufferedReader);
                v3c.i(bufferedReader, null);
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strU0 = w9e.U0(string, "jar:file:");
        int iZ0 = w9e.z0(strU0, '!', 0, false, 6);
        if (iZ0 != -1) {
            strU0 = strU0.substring(0, iZ0);
        }
        String strU02 = w9e.U0(string, "!/");
        JarFile jarFile = new JarFile(strU0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strU02)), "UTF-8"));
            try {
                List<String> file2 = INSTANCE.parseFile(bufferedReader);
                v3c.i(bufferedReader, null);
                jarFile.close();
                return file2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    j47.e(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader r) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = r.readLine();
            if (line == null) {
                return x53.D0(linkedHashSet);
            }
            String string = w9e.b1(w9e.W0(line, "#")).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException("Illegal service provider class name: ".concat(string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R use(JarFile jarFile, m56 m56Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            R r = (R) m56Var.invoke(jarFile);
            jarFile.close();
            return r;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    j47.e(th, th3);
                    throw th;
                }
            }
        }
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> service, ClassLoader loader) {
        ArrayList list = Collections.list(loader.getResources(PREFIX.concat(service.getName())));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d63.V(INSTANCE.parse((URL) it.next()), arrayList);
        }
        Set setH0 = x53.H0(arrayList);
        if (!(!setH0.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(z53.S(setH0, 10));
        Iterator it2 = setH0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), loader, service));
        }
        return arrayList2;
    }
}
