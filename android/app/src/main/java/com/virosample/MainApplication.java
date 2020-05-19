package com.virosample;

import android.app.Application;

import com.facebook.react.ReactApplication;
import org.reactnative.maskedview.RNCMaskedViewPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import com.brentvatne.react.ReactVideoPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.avishayil.rnrestart.ReactNativeRestartPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import org.wonday.orientation.OrientationPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.cmcewen.blurview.BlurViewPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import com.viromedia.bridge.ReactViroPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNCMaskedViewPackage(),
            new SafeAreaContextPackage(),
            new ReactVideoPackage(),
            new VectorIconsPackage(),
            new RNScreensPackage(),
            new ReactNativeRestartPackage(),
            new ReanimatedPackage(),
            new OrientationPackage(),
            new RNGestureHandlerPackage(),
            new RNDeviceInfo(),
            new ReactNativeConfigPackage(),
            new NetInfoPackage(),
            new BlurViewPackage(),
          new ReactViroPackage(ReactViroPackage.ViroPlatform.valueOf(BuildConfig.VR_PLATFORM))
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
