def call(String url,String branch){
  echo 'cloning code'
  git url: "${url}", branch: "${branch}"
  echo 'cloning done'
}
