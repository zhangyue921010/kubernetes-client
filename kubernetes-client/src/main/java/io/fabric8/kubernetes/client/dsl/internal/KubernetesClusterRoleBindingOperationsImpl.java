/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.dsl.internal;

import java.util.Map;
import java.util.TreeMap;

import io.fabric8.kubernetes.api.model.rbac.DoneableKubernetesClusterRoleBinding;
import io.fabric8.kubernetes.api.model.rbac.KubernetesClusterRoleBinding;
import io.fabric8.kubernetes.api.model.rbac.KubernetesClusterRoleBindingList;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.HasMetadataOperation;
import okhttp3.OkHttpClient;

public class KubernetesClusterRoleBindingOperationsImpl extends HasMetadataOperation<KubernetesClusterRoleBinding, KubernetesClusterRoleBindingList, DoneableKubernetesClusterRoleBinding, Resource<KubernetesClusterRoleBinding, DoneableKubernetesClusterRoleBinding>> {

  public KubernetesClusterRoleBindingOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, "v1", null, null, true, null, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>());
  }

  public KubernetesClusterRoleBindingOperationsImpl(OkHttpClient client, Config config, String apiVersion, String namespace, String name, Boolean cascading, KubernetesClusterRoleBinding item, String resourceVersion, Boolean reloadingFromServer, long gracePeriodSeconds, Map<String, String> labels, Map<String, String> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields) {
    super(client, config, "rbac.authorization.k8s.io", apiVersion, "clusterrolebindings", namespace, name, cascading, item, resourceVersion, reloadingFromServer, gracePeriodSeconds, labels, labelsNot, labelsIn, labelsNotIn, fields);
  }

  @Override
  public boolean isResourceNamespaced() {
    return false;
  }
}
