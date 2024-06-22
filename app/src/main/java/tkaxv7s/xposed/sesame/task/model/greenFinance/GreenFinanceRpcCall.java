package tkaxv7s.xposed.sesame.task.model.greenFinance;

import org.json.JSONArray;

import tkaxv7s.xposed.sesame.hook.ApplicationHook;
import tkaxv7s.xposed.sesame.task.model.BaseRpcCall;
import tkaxv7s.xposed.sesame.util.UserIdMap;

public class GreenFinanceRpcCall extends BaseRpcCall {

    public static String greenFinanceIndex() {
        return ApplicationHook.requestString(
                "com.alipay.mcaplatformunit.common.mobile.newservice.GreenFinancePageQueryService.indexV2",
                "[{\"clientVersion\":\"VERSION2\",\"custType\":\"MERCHANT\"}]");
    }

    public static String batchSelfCollect(JSONArray bsnIds) {
        return ApplicationHook.requestString("com.alipay.mcaplatformunit.common.mobile.service.GreenFinancePointCollectService.batchSelfCollect",
                "[{\"bsnIds\":" + bsnIds + ",\"clientVersion\":\"VERSION2\",\"custType\":\"MERCHANT\",\"uid\":\""
                        + UserIdMap.getCurrentUid() + "\"}]");
    }

    public static String signInQuery(String sceneId) {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.signin.query",
                "[{\"cycleCount\":7,\"cycleType\":\"d\",\"extInfo\":{},\"needContinuous\":1,\"sceneId\":\"" + sceneId + "\"}]");
    }

    public static String queryUserTickItem() {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.signin.query",
                "[{\"custType\":\"MERCHANT\",\"firstBehaviorType\":\"lsxd\",\"uid\":\"" + UserIdMap.getCurrentUid() + "\"}]");
    }

    public static String submitTick(String behaviorCode) {
        return ApplicationHook.requestString("com.alipay.mcaplatformunit.common.mobile.newservice.GreenFinanceTickService.submitTick",
                "[{\"custType\":\"MERCHANT\",\"firstBehaviorType\":\"lsxd\",\"uid\":\"" + UserIdMap.getCurrentUid() + "\",\"behaviorCode\":\"" + behaviorCode + "\"}]");
    }

}
